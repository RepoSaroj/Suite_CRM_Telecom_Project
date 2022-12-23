package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.TestBase.TestBaseClass;

public class ReadConfig extends TestBaseClass
{
	
	public ReadConfig() throws IOException 
	{
		String configpath=System.getProperty("user.dir")+"\\Config\\Config.properties";
		//String configpath="C:\\Eclipse Framework\\Suite_CRM_Telecom_Project\\CRMTelecomProject\\Config\\Config.properties";
		File file = new File(configpath);
	    FileInputStream fis = new FileInputStream(file);
	    property.load(fis);
	}
	
	public String getApplicationUrl() 
	{
		String url = property.getProperty("url");
		return url;
	}
	public String getBrowser() 
	{
		String browser = property.getProperty("browser");
		return browser;
	}
	
}
