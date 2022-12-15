package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pos;
public ConfigDataProvider() throws IOException
{
	
	File file=new File("D:/workspace/ConfigClass/config/config.properties");
	FileInputStream fis=new FileInputStream(file);
	pos=new Properties();
	pos.load(fis);
}

public String getDatafromConfig(String KeyToSearch)

{
	return pos.getProperty(KeyToSearch);
}
public String getBrowser()
{
	return pos.getProperty("Browser");
}

public String getStageURL()
{
	return pos.getProperty("qaUrl");
}
}
