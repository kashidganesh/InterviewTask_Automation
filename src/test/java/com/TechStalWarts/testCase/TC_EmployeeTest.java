package com.TechStalWarts.testCase;

import java.util.Map;

import org.testng.annotations.Test;

import com.TechStalWarts.pageObjects.BaseClass;
import com.TechStalWarts.pageObjects.DashBoardPIM;
import com.TechStalWarts.pageObjects.LoginPage;
import com.TechStalWarts.pageObjects.MyInfo;
import com.TechStalWarts.pageObjects.SideBarLinks;
import com.TechStalWarts.testData.DataProviderUtils;
import com.TechStalWarts.utilities.ReadConfig;

public class TC_EmployeeTest extends BaseClass {

	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void addEmployee(Map<String , String> data) {
		new LoginPage(driver).setuserName(data.get("username")).setPass(data.get("password")).doLogin();
		new DashBoardPIM(driver).clickOnPIM().clickOnAdd().setFirstName(data.get("FirstName")).uploadPhoto(data.get("ImagePath"))
		.setLastName(data.get("LastName"))
		.clickOnSubmit();
		new DashBoardPIM(driver).checkCondition2(new ReadConfig().getPIMURL(), "addEmployee");
		new LoginPage(driver).doLogout();
	}


	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void searchEmployee(Map<String , String> data) {
		new LoginPage(driver).setuserName(data.get("username")).setPass(data.get("password")).doLogin();
		new DashBoardPIM(driver).clickOnPIM().clickOnempStatus().searchButton();
		new DashBoardPIM(driver).checkCondition3(userName);
		new LoginPage(driver).doLogout();
	}

	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void isCheckBoxSelected(Map<String , String> data) {
		new LoginPage(driver).setuserName(data.get("username")).setPass(data.get("password")).doLogin();
		new DashBoardPIM(driver).clickAdminMenu().clickOnCheckBox().checkIfCheckboxSelectd("ifCheckBoxSelected");
		new LoginPage(driver).doLogout();

	}

	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void imageUpload(Map<String , String> data) {
		new LoginPage(driver).setuserName(data.get("username")).setPass(data.get("password")).doLogin();
		new MyInfo(driver).clickOnInfo().clickOnProPic().uploadimage().saveinfo();
	}
	
	
	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void sideBarLinks(Map<String , String> data) {
		new LoginPage(driver).setuserName(data.get("username")).setPass(data.get("password")).doLogin();
		new SideBarLinks(driver).clickOnBuzz().clickOnperfornmance().clickOnDire()
		.clickOnDashb().clickOnMyInfo().clickOnRecruit().clickOnTime().clickOnleaveL().clickOnPimL()
		.clickOnadminL();
		new LoginPage(driver).doLogout();
		
	}






}
