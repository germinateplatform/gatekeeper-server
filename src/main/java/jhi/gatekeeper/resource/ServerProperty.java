package jhi.gatekeeper.resource;

/**
 * @author Sebastian Raubach
 */
public enum ServerProperty
{
	DATABASE_SERVER("database.server", null, true),
	DATABASE_NAME("database.name", null, true),
	DATABASE_USERNAME("database.username", null, true),
	DATABASE_PASSWORD("database.password", null, false),
	DATABASE_PORT("database.port", null, false),
	DATA_DIRECTORY_EXTERNAL("data.directory.external", null, false),
	EMAIL_SERVER("email.server", null, true),
	EMAIL_USERNAME("email.username", null, true),
	EMAIL_ADDRESS("email.address", null, true),
	EMAIL_PASSWORD("email.password", null, false),
	EMAIL_PORT("email.port", null, false),
	SALT("salt", "10", false),
	WEB_BASE("web.base", null, true),
	CONTEXT_PATH("context.path", null, true);

	String  key;
	String  defaultValue;
	boolean required;

	ServerProperty(String key, String defaultValue, boolean required)
	{
		this.key = key;
		this.defaultValue = defaultValue;
		this.required = required;
	}

	public String getKey()
	{
		return key;
	}

	public String getDefaultValue()
	{
		return defaultValue;
	}

	public boolean isRequired()
	{
		return required;
	}
}
