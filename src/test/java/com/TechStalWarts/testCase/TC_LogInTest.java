package com.TechStalWarts.testCase;
import java.util.Map;
import org.testng.annotations.Test;
import com.TechStalWarts.pageObjects.BaseClass;
import com.TechStalWarts.pageObjects.LoginPage;
import com.TechStalWarts.testData.DataProviderUtils;



public  class TC_LogInTest extends BaseClass {


	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void logInTest(Map<String , String> data) {
		new LoginPage(driver).setuserName(data.get("username")).setPass(data.get("password")).doLogin();
		new LoginPage(driver).checkCondition("OrangeHRM" , "logInTest");
		new LoginPage(driver).doLogout();
	}

	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void logInWithNoPass(Map<String , String> data) {
		new LoginPage(driver).setuserName(data.get("username")).setPass(data.get("password")).doLogin();
		new LoginPage(driver).checkCondition2(baseURL, "logInWithNoPass");
	}
	

	@Test(dataProviderClass = DataProviderUtils.class , dataProvider = "getData")
	public void LogInwithoutCred(Map<String , String> data) {
		new LoginPage(driver).setuserName(data.get("username")).setPass(data.get("password")).doLogin();
		new LoginPage(driver).checkCondition2(baseURL, "logInWithNoPass");
		
	}

}

