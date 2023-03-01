package com.TechStalWarts.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;




public class BasePage extends BaseClass {

	public  WebDriver driver;
	public BasePage( WebDriver driver) {
		this.driver=driver;
	}




	protected void sendKeys(By by,String value ) {
		WebElement element=driver.findElement(by);
		element.sendKeys(value);
	}


	protected void clicK(By by) {
		driver.findElement(by).click();
	}


	protected void assertCondition4(By by , String tName) {
		WebElement ele=driver.findElement(by);
		if(ele.getText().contains("Records Selected")) {
			Assert.assertTrue(true);
			captureScreenShot(driver, tName);
		}
		else {
			captureScreenShot(driver, tName);
			Assert.assertTrue(false);
		}
	}

	protected void assertCondition3(WebElement element , String tName) {
		if(element.isDisplayed()) {
			Assert.assertTrue(true);
			captureScreenShot(driver, tName);
		}
		else {
			captureScreenShot(driver, tName);
			Assert.assertTrue(false);
		}
	}



	protected void assertCondition3(String url ,String tName) {
		if(!driver.getCurrentUrl().equals(url)) {
			Assert.assertTrue(true);
			captureScreenShot(driver, tName);
		}
		else {
			captureScreenShot(driver, tName);
			Assert.assertTrue(false);
		}
	}

	protected void assertCondition(String msg , String tName) {
		if(driver.getTitle().equals(msg)) {
			Assert.assertTrue(true);
			
		}
		else {
			captureScreenShot(driver, tName);
			Assert.assertTrue(false);
		}
	}


	protected void assertCondition2(String url ,String tName) {
		if(driver.getCurrentUrl().equals(url)) {
			Assert.assertTrue(true);
			captureScreenShot(driver, tName);
		}
		else {
			captureScreenShot(driver, tName);
			Assert.assertTrue(false);
		}
	}
}


