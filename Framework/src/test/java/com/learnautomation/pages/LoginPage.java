package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
		WebDriver driver;
		
		public LoginPage(WebDriver ldriver)
		{
			this.driver=ldriver;
		}
		
		@FindBy(xpath = "//span[.='Log In']") WebElement login;
		
		@FindBy(name = "email") WebElement email;
		
		@FindBy(name = "password") WebElement pass;
		
		@FindBy(xpath = "//div[.='Login']") WebElement loginButton;
		
		public void loginToCRM(String emailApplication, String passwordApplication) throws InterruptedException
		{
			try
			{
				Thread.sleep(3000);
			} catch (InterruptedException e)
			{
				
			}
			
			login.click();
			Thread.sleep(2000);
			email.sendKeys(emailApplication);
			pass.sendKeys(passwordApplication);
			Thread.sleep(2000);
			loginButton.click();
		}

}
