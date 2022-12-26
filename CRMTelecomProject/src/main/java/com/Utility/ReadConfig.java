package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import com.TestBase.TestBaseClass;

public class ReadConfig extends TestBaseClass
{
	
	public ReadConfig()  
	{
		String configpath=System.getProperty("user.dir")+"\\Config\\Config.properties";
		File file = new File(configpath);
	    try 
	    {
		    FileInputStream fis = new FileInputStream(file);
		    property.load(fis);

	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
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
