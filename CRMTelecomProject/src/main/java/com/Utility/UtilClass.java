package com.Utility;

import com.TestBase.TestBaseClass;

public class UtilClass extends TestBaseClass 
{
	public String getUrl() 
	{
		String url = driver.getCurrentUrl();
		return url;
	}
}
