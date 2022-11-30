package com.Utility;

import org.testng.IReporter;

import com.TestBase.TestBaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentsReport extends TestBaseClass implements IReporter
{
	ExtentReports reports;
	ExtentTest test;
	
	public void extentReport() 
	{
		reports = new ExtentReports(property.getProperty("Report"),true);
	}
}
