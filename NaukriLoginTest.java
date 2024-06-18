package tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.FacebookLoginPage;
import Pages.NaukriLoginPage;
import Utils.NaukriBaseTest;

public class NaukriLoginTest extends NaukriBaseTest {
	@DataProvider(name="LoggedinData")
	public Object[][] getLoggedinData(){
		return new Object[][] {
			{"6205002833", "Alsecsum", false},
			{"user2@example.com", "password2", false},
			{"user3@example.com", "password3", false},
			{"user4@example.com", "password4", false},
			{"user5@example.com", "password5", false}
		};
	}
	@Test(dataProvider= "LoggedinData")
	public void testnaukriLogin(String emails, String passwords, boolean isValid) throws Exception {
		NaukriLoginPage loginPage1 = new NaukriLoginPage(driver);
		loginPage1.clickFirstLogin();
		
		loginPage1.fillEmail(emails);
		loginPage1.fillPassword(passwords);
		loginPage1.clickSecondLogin();
		//Assertion for valid data
		if(isValid==true) {
			Assert.assertTrue(loginPage1.isVisibleProfile());
			System.out.println("user is successfully logged in");
		}
		else {
			//Assertion for invalid data
			Assert.assertTrue(loginPage1.isVisibleErr());
			System.out.println("throwing a error message for wrong credentials");

		}
	}
	@Test
	public void testLoginButtonValidation() {
		NaukriLoginPage loginPage1 = new NaukriLoginPage(driver);
		Assert.assertTrue(loginPage1.remoteButtonValidation());
		System.out.println("remote button is present");
	}
	@Test
	public void isemployerLogin() {
		NaukriLoginPage loginPage1 = new NaukriLoginPage(driver);
		loginPage1.hoveredonemployers();
		System.out.println("Clicking on Employers log in");
	}
	@Test
	public void employerLoginVerification() {
		NaukriLoginPage loginPage1 = new NaukriLoginPage(driver);
		loginPage1.employerLoginValidation();
		System.out.println("employerlogin verification and validation done");

	}
	@Test
	public void enterfieldValidation() {
		NaukriLoginPage loginPage1 = new NaukriLoginPage(driver);
		Assert.assertTrue(loginPage1.enterkillsFeildValidation());
		System.out.println("input field is present");
	}

}
