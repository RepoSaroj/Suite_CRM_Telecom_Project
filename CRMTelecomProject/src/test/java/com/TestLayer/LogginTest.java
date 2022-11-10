package com.TestLayer;

import java.io.IOException;

import org.testng.annotations.Test;

import com.TestBase.TestBaseClass;
import com.Utility.ReadData;

public class LogginTest extends TestBaseClass
{
	@Test
	public void verifyLoginTest() throws InterruptedException, IOException 
	{
		login.enterUserName(ReadData.readData("crmData", 1, 0));
		login.enterPassword(ReadData.readData("crmData", 1, 1));
		login.clickOnLoginBtn();
		Thread.sleep(3000);
	}
}
