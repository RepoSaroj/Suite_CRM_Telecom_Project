package com.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListenerSetup extends ExtentsReport implements ITestListener
{
	
	public void onTestStart(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.INFO,"Test Execution Start");
	}

	
	public void onTestSuccess(ITestResult result)
	{
		test.log(Status.INFO,"Test Execution complete");
		test.log(Status.PASS,"Test Execution Pass");
		test.addScreenCaptureFromPath(UtilClass.getScreenshotPath(result.getName()));
	}

	
	public void onTestFailure(ITestResult result) 
	{
		test.log(Status.INFO,"Test Execution Complete");
		test.log(Status.FAIL,"Test Execution Failed");
		test.addScreenCaptureFromPath(UtilClass.getScreenshotPath(result.getName()));
	}

	public void onTestSkipped(ITestResult result)
	{
		test.log(Status.SKIP,"Test Execution Skip");
	}

	public void onStart(ITestContext context)
	{
		extentReportGenerate();
	}

	
	public void onFinish(ITestContext context)
	{
		extent.flush();
	}

}
