package com.dsalgo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.base.TestBase;

public class GetStartedButton extends TestBase{

	//Page Factory -OR (Object Repositatory)
	@FindBy(xpath="//button[@class='btn']")
	WebElement getstartedbtn;
	
	
	// Initializing the Page Objects
	public GetStartedButton()
	{
		PageFactory.initElements(driver,this);
	}
	//Actions
	public String validateGetstartedPageTitle()
	{
		return driver.getTitle();
	}
	public HomePage startedbtn()
	{
		getstartedbtn.click();
		return new HomePage();
	}
}
