package com.TechStalWarts.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DashBoardPIM extends BasePage{

	WebDriver driver;
	JavascriptExecutor je=(JavascriptExecutor) driver;


	public DashBoardPIM(WebDriver driver) {

		super(driver);
	}

	private final By pim=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span");
	private final By fName=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input");
	private final By lName=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input");
	private final By profilePct=By.xpath("//button[@class='oxd-icon-button employee-image-action']");
	private final By submitBtn=By.xpath("//button[@type='submit']");
	private final By addEmp=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
	private final By empStatus=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]");
	private final By fullTimePer=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[4]");
	private final By searchbutton=By.xpath("//button[@type='submit']");
	private final By records=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]");
	private final By adminMenu=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");
	private final By checkBox1=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[1]/div/label");
	private final By textSelected=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/span");
 




	public DashBoardPIM checkIfCheckboxSelectd(String tName) {
		assertCondition4(textSelected , tName);
		return this;
	}

	public DashBoardPIM clickOnCheckBox() {

		clicK(checkBox1);

		return this;	
	}

	public DashBoardPIM clickAdminMenu() {
		clicK(adminMenu);
		return this;
	}

	public DashBoardPIM searchButton() {
		try {
			clicK(searchbutton);
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return this;
	}
	public DashBoardPIM clickOnempStatus() {
		clicK(empStatus);
		clicK(fullTimePer);
		return this;
	}

	public DashBoardPIM clickOnAdd() {
		clicK(addEmp);
		return this;
	}

	public DashBoardPIM clickOnPIM() {
		clicK(pim);
		return this;

	}

	public DashBoardPIM setFirstName(String value) {
		sendKeys(fName, value);
		return this;
	}

	public DashBoardPIM setLastName(String value) {
		sendKeys(lName, value);
		return this;
	}

	public DashBoardPIM uploadPhoto(String path) {

		try {
			sendKeys(profilePct, path);
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this;
	}

	public void clickOnSubmit() {
		clicK(submitBtn);
	}

	public void checkCondition2(String url ,String tName) {
		assertCondition3(url, tName);
	}


	public void checkCondition3( String tName) {
		try {
			JavascriptExecutor je=(JavascriptExecutor) driver;
			je.executeScript("window.scrollBy(0,400)", "");
			assertCondition3(driver.findElement(records), tName);}
		catch(Exception e) {
			e.getMessage();
		}

	}




}









