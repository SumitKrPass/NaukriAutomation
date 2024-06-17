package learningSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FbVerification {
	WebDriver driver;
	@BeforeTest
	public void navigateToURl() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void validateTextonLandingPage() {
		String expectedstr = "Log in";
		String actualstr = driver.findElement(By.xpath("//button[@type='submit']")).getText();
		Assert.assertEquals(actualstr,expectedstr);
		System.out.println("Log in text is verified");
	}
	@Test
	public void verifyTextonLandingPage() {
		String expectedstr1 = "Create new account";
		String actualstr1 = driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-')]")).getText();
		Assert.assertEquals(actualstr1,expectedstr1);
		System.out.println("Create new account text is verified");
	}
	@Test
	public void verifyforgotpassonlandingpage() {
		String expectedstr2 = "Forgotten password?";
		String actualstr2 = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		Assert.assertEquals(actualstr2,expectedstr2);
		System.out.println("Create new account text is verified");
	}
	@Test
	public void verifyURLOnLandingPage() {
		String expectedURL = "https://www.facebook.com/";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL,expectedURL);
		System.out.println("URL verified");
	}
	public void verifyTitleOnLandingPage() {
		String expectedTitle = "Facebook -log in or sign up";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle);
		System.out.println("Title verified");

}
	@AfterTest
	public void closingbrowser() {
		driver.quit();
	}
}