package com.Utility;

import java.io.File;

import org.testng.IReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentsReport implements IReporter
{
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public void extentReportGenerate() 
	{
		extent = new ExtentReports();
		
		String path = System.getProperty("user.dir")+"\\ExtentReports\\eReorts.html";
		
		File file = new File(path);
		
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		
		extent.attachReporter(sparkReporter);
		
	}
}
