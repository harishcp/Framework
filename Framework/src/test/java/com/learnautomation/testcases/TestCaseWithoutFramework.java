package com.learnautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithoutFramework {

	@Test
	public void Test1() throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Gifts for her");
	Thread.sleep(2000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.linkText("BRYAN & CANDY")).click();
	driver.navigate().to("http://insaid.co");
	Thread.sleep(10000);
	driver.navigate().back();
	driver.quit();
	}

}
