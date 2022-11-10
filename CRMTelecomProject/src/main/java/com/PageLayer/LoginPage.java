package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBaseClass;

public class LoginPage extends TestBaseClass
{
	//initialization
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------------Object Repo-----------
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	@FindBy(xpath="//button[@id='login-button']")
	private WebElement loginBtn;
	
	//-------Action Methods---------
	public void enterUserName(String user)
	{
		username.sendKeys(user);
	}
	public void enterPassword(String pass) 
	{
		password.sendKeys(pass);
	}
	public void clickOnLoginBtn()
	{
		loginBtn.click();
	}

	
}
