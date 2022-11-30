package com.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.TestBase.TestBaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ListenerSetup extends TestBaseClass implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Testcase execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Testcase execution passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Testcase execution failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Testcase execution skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
