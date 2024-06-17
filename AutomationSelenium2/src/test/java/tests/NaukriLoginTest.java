package tests;

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
	public void testFacebookLogin(String email, String password, boolean isValid) {
		NaukriLoginPage loginPage = new NaukriLoginPage(driver);
		loginPage.clickFirstLogin();
		loginPage.fillEmail(email);
		loginPage.fillPassword(password);
		loginPage.clickSecondLogin();;
		//Assertion for valid data
		if(isValid==true) {
			Assert.assertTrue(loginPage.isVisibleProfile());
			System.out.println("user is successfully logged in");
		}
		else {
			//Assertion for invalid data
			Assert.assertTrue(loginPage.isVisibleErr());
			System.out.println("throwing a error message for wrong credentials");

		}

	}

}
