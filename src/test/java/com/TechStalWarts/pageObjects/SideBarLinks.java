package com.TechStalWarts.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class  SideBarLinks extends BasePage{
	WebDriver driver;
	JavascriptExecutor je=(JavascriptExecutor) driver;


	public SideBarLinks(WebDriver driver) {

		super(driver);
	}
	
	
	private final By buzzL=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[11]/a/span");
	private final By maintanceL=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[10]/a/span");
	private final By directoryL=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a/span");
	private final By dashboardL=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a/span");
	private final By performanceL=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[7]/a/span");
	private final By myInfoL=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span");
	private final By recruitementL=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span");
	private final By timeL=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a/span");
	private final By leaveL=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span");
	private final By pimL=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span");
	private final By adminL=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span");
	
	
	
	
	public SideBarLinks clickOnadminL() {
		clicK(adminL);
		return this;
	}
	public SideBarLinks clickOnPimL() {
		clicK(pimL);
		return this;
	}
	
	
	public SideBarLinks clickOnleaveL() {
		clicK(leaveL);
		return this;
	}
	
	public SideBarLinks clickOnTime() {
		clicK(timeL);
		return this;
	}
	
	
	
	public SideBarLinks clickOnRecruit() {
		clicK(recruitementL);
		return this;
	}
	
	public SideBarLinks clickOnMyInfo() {
		clicK(myInfoL);
		return this;
	}
	
	
	public SideBarLinks clickOnperfornmance() {
		clicK(performanceL);
		return this;
	}
	
	public SideBarLinks clickOnDashb() {
		clicK(dashboardL);
		return this;
	}
	
	public SideBarLinks clickOnDire() {
		clicK(directoryL);
		return this;
	}
	
	public SideBarLinks clickOnMain() {
		clicK(maintanceL);
		return this;
	}
	
	public SideBarLinks clickOnBuzz() {
		clicK(buzzL);
		return this;
	}
	

			
}
