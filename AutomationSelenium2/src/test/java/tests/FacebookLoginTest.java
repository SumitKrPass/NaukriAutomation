package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.FacebookLoginPage;
import Utils.BaseTest;

public class FacebookLoginTest extends BaseTest{
	@Test
	public void testURLValidation() {
		String expectedURL = "https://www.facebook.com/"; 
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL,"URL is not Verified");
	}
	
	@Test
	public void  testTitleValidation() {
		FacebookLoginPage loginPage = new FacebookLoginPage(driver);
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle,"Title is not verified");
	}
	@Test
	public void testInputFieldValidation() {
		FacebookLoginPage loginPage = new FacebookLoginPage(driver);
        Assert.assertTrue(loginPage.isEmailFieldDisplayed(),"Log in button isn't displayed");
        Assert.assertTrue(loginPage.isPasswordFieldDisplayed(),"Password button isn't displayed");
	}
	
	@Test
	public void testLoginButtonValidation() {
		FacebookLoginPage loginPage = new FacebookLoginPage(driver);
		Assert.assertTrue(loginPage.isLoginButtonDisplayed(),"Login button isn't displayed");
	}
	
	@Test
	public void testCreateNewAccountButtonValidation() {
		FacebookLoginPage loginPage = new FacebookLoginPage(driver);
		Assert.assertTrue(loginPage.isCreateNewAccountButtonDisplayed(),"create new account isn't displayed");


	}

}
