package com.TechStalWarts.pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private final By userName=By.xpath("//input[@name='username']");
	private final By passWord=By.xpath("//input[@name='password']");
	private final By loginButton=By.xpath("//button[@type='submit']");
	private final By logOutDropDown=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li");
	private final By logout=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a");


	public void doLogout()  {
		clicK(logOutDropDown);
		clicK(logout);
	}
	
	
	public LoginPage setuserName(String uname) {
		sendKeys(userName, uname );
		return this;
	}

	public LoginPage setPass(String pass) {
		sendKeys(passWord, pass );
		return this;
	}

	public void doLogin() {
		clicK(loginButton);
	}
	
	
	public void checkCondition(String msg ,String tName) {
		assertCondition(msg, tName);
	}
	
	public void checkCondition2(String url ,String tName) {
		assertCondition2(url, tName);
	}

}
