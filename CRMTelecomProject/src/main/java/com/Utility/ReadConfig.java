package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig 
{
	Properties property;
	public ReadConfig() throws IOException 
	{
		String configpath="C:\\Eclipse Framework\\CRM\\CRMTelecomProject\\Config\\Config.properties";
	    File file = new File(configpath);
	    FileInputStream fis = new FileInputStream(file);
	    property = new Properties();
	    property.load(fis);
	}
	
	public String getApplicationUrl() 
	{
		String url = property.getProperty("url");
		return url;
	}
	
}
