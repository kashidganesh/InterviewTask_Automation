package com.TechStalWarts.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyInfo extends BasePage {

	WebDriver driver;
	public MyInfo(WebDriver driver) {
		super(driver);
	}

	private final By info=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a");
	private final By profileP=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[2]/div/img");
	private final By addButton=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/form/div[1]/div/div/div[2]/div/div/img");
    private final By saveInfo=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/button");


	public MyInfo clickOnInfo() {
		clicK(info);
		return this;
	}

	public MyInfo clickOnProPic() {
		clicK(profileP);
		return this;
	}


	public MyInfo uploadimage() {
		
		driver.findElement(addButton).sendKeys("C:\\\\Users\\\\Admin\\\\Downloads\\\\SampleJPGImage_50kbmb.jpg");
	//	sendKeys(addButton, "C:\\Users\\Admin\\Downloads\\SampleJPGImage_50kbmb.jpg");
		return this;
	}
	
	
	public void saveinfo() {
		clicK(saveInfo);
	}
	


}

