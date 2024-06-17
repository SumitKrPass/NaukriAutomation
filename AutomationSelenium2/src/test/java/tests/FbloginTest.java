package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.FacebookLoginPage;
import Utils.BaseTest;

public class FbloginTest extends BaseTest{
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
	@DataProvider(name="LoginData")
	public Object[][] getLoginData(){
		return new Object[][] {
			{"6205002833", "Alsecsum", true},
			{"user1@example.com", "password1", false},
			{"user1@example.com", "password1", false},
			{"user1@example.com", "password1", false},
			{"user1@example.com", "password1", false},
		};
	}
	@Test(dataProvider= "LoginData")
	public void testFacebookLogin(String email, String password, boolean isValid) {
		FacebookLoginPage loginPage = new FacebookLoginPage(driver);
		loginPage.enterEmail(email);
		loginPage.enterpassword(password);
		loginPage.clickLogin();
		//Assertion for valid data
		if(isValid==true) {
			Assert.assertTrue(loginPage.isUserprofilevisible());
			System.out.println("user is successfully logged in");
		}
		else {
			//Assertion for invalid data
			Assert.assertTrue(loginPage.iserrormessagevisible());
			System.out.println("throwing a error message for wrong credentials");

		}

	}


}
