package com.dsalgo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dsalgo.qa.base.TestBase;

public class HomePage extends TestBase{
	
	//Page Factory -OR (Object Repositatory)
	
		@FindBy(xpath="/html/body/div[1]/nav/a")
		WebElement NumpyNinjalink;
		
		@FindBy(xpath="//*[@id='navbarCollapse']/div[1]/div/a")
		WebElement Dropdown;
		
		@FindBy(xpath="/html/body/div[1]/nav/div/div[2]/ul/a[2]")
		WebElement Registerbutton();
		
		@FindBy(xpath="//*[@id='navbarCollapse']/div[2]/ul/a[3]")
		WebElement Signinbutton();
		
		@FindBy
		WebElement Datastructuregsbtn();
		
		@FindBy
		WebElement Arraygsbtn();
		
		@FindBy
		WebElement Linkedlistgsbtn();
		
		@FindBy
		WebElement Stackgsbtn();
		
		@FindBy
		WebElement Queuegsbtn();
		
		@FindBy
		WebElement Treegsbtn();
		
		@FindBy
		WebElement Graphgsbtn();
		
	
		// Initializing the Page Objects
		public HomePage()
		{
			PageFactory.initElements(driver,this);
		}	
		
		//Actions
		
		
		
		
}
