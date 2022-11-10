package com.PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBaseClass;

public class HomePage extends TestBaseClass
{
	//-------WebElement initialization---------
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	//-----------Obj Repo-------------------
	@FindBy(xpath="(//a[contains(@class, 'top-nav')])[1]")
	private WebElement Accounts;
	
	@FindBy(xpath="(//a[contains(@class, 'top-nav')])[2]")
	private WebElement Contacts;
	
	@FindBy(xpath="(//a[contains(@class, 'top-nav')])[3]")
	private WebElement Opportunities;
	
	@FindBy(xpath="(//a[contains(@class, 'top-nav')])[4]")
	private WebElement Leads;
	
	@FindBy(xpath="(//a[contains(@class, 'top-nav')])[5]")
	private WebElement Quotes;
	
	@FindBy(xpath="(//a[contains(@class, 'top-nav')])[6]")
	private WebElement Calendar;
	
	@FindBy(xpath="//a[contains(@class, 'sub-nav')]")
	private List <WebElement> module_link;
	
	//------------Action method----------

	public void moveToAccounts() 
	{
		action.moveToElement(Accounts).perform();
	}
	
	public void clickOnModuleLink(String link) 
	{
		for(int i=0; i<module_link.size(); i++) 
		{
			String ModuleLink = module_link.get(i).getText();
			if(ModuleLink.equalsIgnoreCase(link)) 
			{
				module_link.get(i).click();
			}
		}
	}
}
