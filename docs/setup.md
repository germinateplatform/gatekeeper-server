---
title: Gatekeeper Setup
---

# Gatekeeper Setup

There are many ways in which you can run Gatekeeper.

If you are familiar with Docker and containerization, then the Gatekeeper Docker container is probably the best option.
It requires the least amount of configuration, assuming you already have a working Docker environment. If Docker is an alien concept to you, then a manual build of Gatekeeper will most likely be the best option.

The following page will take you through both scenarios and explain all the necessary steps to get Gatekeeper up and running.

- [Docker](#docker)
- [Manual setup](#manual-setup)
  - [Requirements](#requirements)
  - [Gatekeeper Client](#client)
    - [Download](#download-gatekeeper-client)
    - [Configure](#configure-gatekeeper-client)
    - [Build](#build-gatekeeper)
  - [Gatekeeper Server](#server)
    - [Download](#download-gatekeeper-server)
    - [Configure](#configure-gatekeeper-server)
    - [Include client](#include-gatekeeper-client)
    - [Build](#build-gatekeeper-server)
 - [Proxy](#proxy)

## Docker

Let's start with the simpler case: Docker. We have a working Docker image of Gatekeeper available on [DockerHub](https://hub.docker.com/repository/docker/cropgeeks/gatekeeper) that you can simply pull and run on your machine/server.

Additionally you will need a MySQL database. This can either be another Docker container or an existing database server that you already have. The examples below contain a Docker MySQL container. If you wish to use your own database, simply remove the relevant parts from the docker file or docker commands.

If you have docker-compose available, things are as simple as defining this `docker-compose.yml` file. Only change the parts that have comments above them.

```yaml
version: '3.3'
services:
  mysql:
    image: mysql:8.4
    ports:
      - 9306:3306
    volumes:
      - type: volume
        source: mysql
        target: /var/lib/mysql/
    environment:
      # The root password. This is not used by Gatekeeper, but can be used to access the database externally
      MYSQL_ROOT_PASSWORD: PASSWORD_HERE
      # The name of the Gatekeeper database, e.g. "gatekeeper"
      MYSQL_DATABASE: GATEKEEPER_DATABASE_NAME
      # The username Gatekeeper will use to connect to this database
      MYSQL_USER: DATABASE_USER
      # The password Gatekeeper will use to connect to this database
      MYSQL_PASSWORD: DATABASE_PASSWORD
    restart: unless-stopped
    container_name: mysql

  tomcat:
      image: cropgeeks/gatekeeper:release-x86-4.2.1
      environment:
        - JAVA_OPTS:-Xmx512m
      ports:
        - 9080:8080
      volumes:
        - type: bind
          # This points to where your Gatekeeper configuration folder is outside the container
          source: /path/to/your/gatekeeper/config
          target: /data/gatekeeper
        - type: volume
          source: gatekeeper
          target: /usr/local/tomcat/temp
      restart: unless-stopped
      container_name: gatekeeper
      depends_on:
        - "mysql"

volumes:
  gatekeeper:
  mysql:
```

If you don't use docker-compose, here is an example of those same instructions as basic Docker commands. See the comments in the `docker-compose.yml` file above to see which parts need changing:

```shell
docker volume create gatekeeper
docker volume create mysql

docker network create gatekeeper

docker run -d \
    --name mysql \
    --network gatekeeper \
    -e MYSQL_ROOT_PASSWORD=ROOT_PASSWORD_HERE \
    -e MYSQL_DATABASE=GATEKEEPER_DATABASE_NAME \
    -e MYSQL_USER=DATABASE_USER \
    -e MYSQL_PASSWORD=DATABASE_PASSWORD \
    -v mysql:/var/lib/mysql \
    -p 9306:3306 \
    --restart unless-stopped \
    mysql:8.4

docker run -d \
    --name gatekeeper \
    --network gatekeeper \
    -e JAVA_OPTS=-Xmx512m \
    -v gatekeeper:/usr/local/tomcat/temp \
    -v /path/to/your/gatekeeper/config:/data/gatekeeper \
    -p 9080:8080 \
    --restart unless-stopped \
    cropgeeks/gatekeeper:release-x86-4.2.1
```

Make sure you have at least a `config.properties` file in the location at `/path/to/your/gatekeeper/config`. See <a href="config.html">Configuration</a> for additional config options. This file will contain the database configuration and also this property:

```ini
# This is the folder inside Docker, don't set this to your config folder location as this is taken care of by a Docker bind.
data.directory.external=/data/gatekeeper
```

**Tip**: When using the setup as described above, make sure to set the `database.server` property in the `config.properties` file to `mysql`, as this is the address of the database within the Docker network. If you rename the MySQL service, please use that new name.

## Manual setup

Setting up Gatekeeper manually involves a few steps that have to be done for every new release.

### Requirements

Server:
- Java 11 or above
- Tomcat 8.5.12 or above
- MySQL 8.4 or above (or MariaDB 10.5.0 or above)

Client:
- Node.js 10.15.1 or above
- NPM 6.4.1 or above

We are going to assume that you have a running Tomcat and a running MySQL database that we can link into.

Make sure that your MySQL server contains an empty database (or a database from a version 3 release of Gatekeeper). The name of this database is then used in the [server configuration section](#configure-gatekeeper-server).

An exemplar command to create such a database is:

```shell
mysql -u root -e "create database gatekeeper;"
```

### Client

The steps involved to build the client of Gatekeeper are as follows:

1. Download the Gatekeeper Client code from GitHub
2. Set up the configuration file
3. Build Gatekeeper

#### Download Gatekeeper Client
You can either download the code from GitHub directly via the [releases](https://github.com/germinateplatform/gatekeeper-vue/releases) or you can check out the latest release via the command line: 

```shell
git clone -b '4.2.1' --depth 1 https://github.com/germinateplatform/gatekeeper-vue.git
```

#### Configure Gatekeeper Client
Run this from within the root directory of the source code to install all dependencies:

```shell
npm i
```


Create a file called `.env` and add this to it:

```ini
VUE_APP_BASE_URL=./api/
```

Where `project.name` comes from the Gatekeeper Server configuration below.

#### Build Gatekeeper

Run this to build Gatekeeper:

```shell
npm run build
```

This will generate HTML and JS files inside the `dist` directory. We will now move on to the build process of the server code.

### Server

Setting up the server involves the following steps:

1. Download the Gatekeeper Server code from GitHub
2. Set up the configuration file and the external configuration directory
3. Include the client code in the deploy
4. Build and deploy Gatekeeper Server to Tomcat

Let's go through these steps one at a time.

#### Download Gatekeeper Server
You can either download the code from GitHub directly via the [releases](https://github.com/germinateplatform/gatekeeper-server/releases) or you can check out the latest release via the command line: 

```shell
git clone -b '4.2.1' --depth 1 https://github.com/germinateplatform/gatekeeper-server.git
```

#### Configure Gatekeeper Server

Rename `config.template.properties` to `config.properties` and `gradle.template.properties` to `gradle.properties`.

Change `gradle.properties` like this:

```ini
tomcat.manager.version=<your tomcat version, e.g. 'tomcat8x'>
tomcat.manager.protocol=<protocol of tomcat, e.g. 'http'>
tomcat.manager.hostname=<host of tomcat, e.g. 'localhost'>
tomcat.manager.port=<port of tomcat, e.g. '8080'>
tomcat.manager.username=<tomcat username>
tomcat.manager.password=<tomcat password>

project.name=<the relative path inside tomcat, e.g. 'gatekeeper' -> http://localhost:8080/gatekeeper/v4.2.1>
```

Change `config.properties` like this:

```ini
data.directory.external = <path to the configuration directory>
```

The configuration directory and its content are described in the <a href="config.html">configuration options</a>.

#### Include Gatekeeper Client

Copy the whole content of the `dist` directory within the Gatekeeper Client source `client` directory within the Gatekeeper Server source (you may have to create a `client` folder at the root level of the project). 

#### Build Gatekeeper Server

Once all previous steps are complete, building Gatekeeper Server is as simple as calling:

```shell
gradle deployTomcat
```

After the build process is complete, the Gatekeeper API will be available at the specified location (`<tomcat-url>/<project.name>/v4.2.1`).


## Proxy

If Gatekeeper is sitting behind a proxy, further setup may be required. We'll give an example that shows you how to set up Apache to properly work with Gatekeeper.


```
# Allow rewrite rules
RewriteEngine on
# Preserve request URL
ProxyPreserveHost On

# Make sure trailing slashes are added
RewriteRule     ^/gatekeeper$ /gatekeeper/ [R]

# Define the mapping
<Location /gatekeeper/>
    ProxyPass        http://internalserver:1234/
    ProxyPassReverse http://internalserver:1234/

    # Make sure cookies get the correct path
    ProxyPassReverseCookiePath / /gatekeeper  
</Location>
```

The example above maps `/gatekeeper/` on your public server to an internal server `http://internalserver:1234/`. The other settings make sure that trailing slashes are automatically added and that the original request URL are passed through.

When you copy the example above, make sure to replace "gatekeeper" with the mapping you want to use publicly and "http://internalserver:1234/" with your internal server.