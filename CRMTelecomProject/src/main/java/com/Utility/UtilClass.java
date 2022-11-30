package com.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.TestBase.TestBaseClass;

import net.bytebuddy.utility.RandomString;

public class UtilClass extends TestBaseClass 
{
	public String getUrl() 
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public static void getScreenshot() throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		String path = property.getProperty("ScreenshotPath");
		String Random = RandomString.make(2);
		File dest = new File(path+Random+".png");
		FileHandler.copy(file, dest);
		
	}
	public static void getElementScreenshot(WebElement element ) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot)element;
		File file = ts.getScreenshotAs(OutputType.FILE);
		String path = property.getProperty("ScreenshotPath");
		String Random = RandomString.make(2);
		File dest = new File(path+Random+".png");
		FileHandler.copy(file, dest);
		
	}
}
