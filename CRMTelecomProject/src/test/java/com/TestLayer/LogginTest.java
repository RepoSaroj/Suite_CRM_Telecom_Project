package com.TestLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestBase.TestBaseClass;



public class LogginTest extends TestBaseClass
{
	String expected_url = "https://suite8demo.suiteondemand.com/#/home";
	
	@Test
	public void verifyLoginTest() throws InterruptedException, IOException 
	{
		Thread.sleep(6000);
		Assert.assertEquals(util.getUrl(), expected_url);
		logger.info("assertion pass");
	}
}
