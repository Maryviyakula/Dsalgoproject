package com.dsalgo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dsalgo.qa.base.TestBase;
import com.dsalgo.qa.pages.GetStartedButton;
import com.dsalgo.qa.pages.HomePage;

public class GetStartedButtonTest extends TestBase{
	GetStartedButton getstarted;
	HomePage homePage;
	public GetStartedButtonTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		getstarted=new GetStartedButton();
		
	}
	@Test(priority = 1)
	public void GetstartedPageTitleTest()
	{
	String title=getstarted.validateGetstartedPageTitle();
	Assert.assertEquals(title, "Numpy Ninja");
	}
	@Test(priority = 2)
	public void gstest()
	{
		homePage=getstarted.startedbtn();
		
	}
//	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}
}
