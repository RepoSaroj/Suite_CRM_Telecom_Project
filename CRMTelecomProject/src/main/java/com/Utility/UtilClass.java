package com.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.TestBase.TestBaseClass;

public class UtilClass extends TestBaseClass 
{
	public String getUrl() 
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public static String getScreenshotPath(String name) 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"\\Screenshots\\";
		File destination = new File(path + name + ".png");
		

		try
		{
			FileHandler.copy(source, destination);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return destination.getAbsolutePath();
	}
}
