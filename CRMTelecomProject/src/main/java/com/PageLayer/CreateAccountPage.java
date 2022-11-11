package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBaseClass;

public class CreateAccountPage extends TestBaseClass
{
	//-----WebElement initialization---------
	public CreateAccountPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------Obj Repo----------------------
	@FindBy(xpath="//input[contains(@class, 'form-control global')]")
	private WebElement Search;
	@FindBy(xpath="//input[@class='form-control form-control-sm ng-untouched ng-pristine ng-invalid']")
	private WebElement Name;
	@FindBy(xpath="(//input[@class='form-control form-control-sm ng-untouched ng-pristine ng-valid'])[1]")
	private WebElement Office_Phone;
	@FindBy(xpath="//input[@class='form-control form-control-sm ng-pristine ng-valid ng-touched']")
	private WebElement Website;
	@FindBy(xpath="(//input[@class='form-control form-control-sm ng-untouched ng-pristine ng-valid'])[2]")
	private WebElement Fax;
	
	//-------------billing Adreess object--------------------
	@FindBy(xpath="((//div[@class='flex-grow-1 text-break'])[6]//input)[1]")
	private WebElement Billing_Street;
	@FindBy(xpath="((//div[@class='flex-grow-1 text-break'])[6]//input)[2]")
	private WebElement Billing_Postal_Code;
	@FindBy(xpath="((//div[@class='flex-grow-1 text-break'])[6]//input)[3]")
	private WebElement Billing_City;
	@FindBy(xpath="((//div[@class='flex-grow-1 text-break'])[6]//input)[4]")
	private WebElement Billing_State;
	@FindBy(xpath="((//div[@class='flex-grow-1 text-break'])[6]//input)[5]")
	private WebElement Billing_Country;
	
	//----------------shipping Adreess object------------
	@FindBy(xpath="((//div[@class='flex-grow-1 text-break'])[7]//input)[1]")
	private WebElement Shipping_Street;
	@FindBy(xpath="((//div[@class='flex-grow-1 text-break'])[7]//input)[2]")
	private WebElement Shipping_Postal_Code;
	@FindBy(xpath="((//div[@class='flex-grow-1 text-break'])[7]//input)[3]")
	private WebElement Shipping_City;
	@FindBy(xpath="((//div[@class='flex-grow-1 text-break'])[7]//input)[4]")
	private WebElement Shipping_State;
	@FindBy(xpath="((//div[@class='flex-grow-1 text-break'])[7]//input)[5]")
	private WebElement Shipping_Country;
	
	//--------------buttons----------------------------
	@FindBy(xpath="(//button[@type='button'])[1]")
	private WebElement New_Btn;
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement Save_Btn;
	@FindBy(xpath="(//button[@type='button'])[3]")
	private WebElement Cancle_Btn;
	@FindBy(xpath="(//button[@type='button'])[4]")
	private WebElement addEmail_plus_Sign;
	@FindBy(xpath=
	"//input[@class='form-control form-control-sm ng-untouched ng-pristine ng-invalid']")
	private WebElement enter_email;
	
	
	//------------Actions Method------------------
	public void enterName(String name) 
	{
		Name.sendKeys(name);
	}
	public void enterOfficePhone(String phone) 
	{
		Office_Phone.sendKeys(phone);
	}
	public void enterWebsite(String Web)
	{
		Website.sendKeys(Web);
	}
	public void enterFaxNo(String faxNo) 
	{
		Fax.sendKeys(faxNo);
	}
	public void enterEmailAddress(String email) 
	{
		addEmail_plus_Sign.click();
		enter_email.sendKeys(email);
	}
	
	//----------billing address-------------
	public void enterBillingStreet(String billing_street) 
	{
		Billing_Street.sendKeys(billing_street);
	}
	public void enterBillingPostalCode(String billing_postalCode) 
	{
		Billing_Postal_Code.sendKeys(billing_postalCode);
	}
	public void enterBillingCity(String billing_city) 
	{
		Billing_City.sendKeys(billing_city);
	}
	public void enterBillingState(String billing_state)
	{
		Billing_State.sendKeys(billing_state);
	}
	public void enterBillingCountry(String billing_country)
	{
		Billing_Country.sendKeys(billing_country);
	}

	//-------------shipping address--------------------
	public void enterShippingStreet(String shipping_street) 
	{
		Shipping_Street.sendKeys(shipping_street);
	}
	public void enterShippingPostslCode(String shipping_postalcode) 
	{
		Shipping_Postal_Code.sendKeys(shipping_postalcode);
	}
	public void enterShippingCity(String shipping_city) 
	{
		Shipping_City.sendKeys(shipping_city);
	}
	public void enterShippingState(String shipping_state)
	{
		Shipping_State.sendKeys(shipping_state);
	}
	public void enterShippingCountry(String shipping_country) 
	{
		Shipping_Country.sendKeys(shipping_country);
	}
	public void clickOnSaveBtn() 
	{
		Save_Btn.click();
	}
}
