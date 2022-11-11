package com.TestLayer;

import org.testng.annotations.Test;
import com.TestBase.TestBaseClass;

public class CreateAccountTest extends TestBaseClass
{
	@Test
	public void verifyCreateAccount() throws InterruptedException 
	{
		action.moveToElement(home.accountsModule())
		.moveToElement(home.createAccountLink())
		.click().build().perform();
		Thread.sleep(5000);
		
		createAccount.enterName("Pulajwar Saroj");
		Thread.sleep(2000);
		createAccount.enterWebsite("Omkar.com");
		Thread.sleep(2000);
		createAccount.enterOfficePhone("456789");
		Thread.sleep(2000);
		createAccount.enterFaxNo("123456");
		Thread.sleep(2000);
		createAccount.enterEmailAddress("omkar123@gmail.com");
		Thread.sleep(2000);
		
		//----billing info-----
		createAccount.enterBillingStreet("billingOmkarPharate");
		Thread.sleep(2000);
		createAccount.enterBillingPostalCode("123");
		Thread.sleep(2000);
		createAccount.enterBillingCity("Nanded");
		Thread.sleep(2000);
		createAccount.enterBillingState("Maharashtra");
		Thread.sleep(2000);
		createAccount.enterBillingCountry("India");
		Thread.sleep(2000);
		
		//----------------shipping info---------------
		createAccount.enterShippingStreet("ShippingOmkarPharate");
		Thread.sleep(2000);
		createAccount.enterShippingPostslCode("456");
		Thread.sleep(2000);
		createAccount.enterShippingCity("Pune");
		Thread.sleep(2000);
		createAccount.enterShippingState("Maharashtra");
		Thread.sleep(2000);
		createAccount.enterShippingCountry("India");
		Thread.sleep(2000);
	//	createAccount.clickOnSaveBtn();
	}
}
