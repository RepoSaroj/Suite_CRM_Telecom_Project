package com.TestLayer;

import org.testng.annotations.Test;

import com.TestBase.TestBaseClass;

public class CreateAccountTest extends TestBaseClass
{
	@Test
	public void verifyCreateAccount() throws InterruptedException 
	{
		Thread.sleep(6000);
		home.moveToAccounts();
		home.clickOnModuleLink("create account");
	}
}
