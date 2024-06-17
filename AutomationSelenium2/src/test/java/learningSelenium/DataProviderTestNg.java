package learningSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNg {
	WebDriver driver;
	@BeforeClass
	public void SetBrowserEnvironment() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com");
		
	}
	@DataProvider
	
	public Object[][] dataSet(){
		Object[][] arr= new Object[3][2];
		arr[0][0]= "Username1";
		arr[0][1]= "Password1";
		arr[1][0]= "Username2";
		arr[1][1]= "Password2";
		arr[2][0]= "Username3";
		arr[2][1]= "Password3";
		return arr;
	}
	@Test(dataProvider = "dataSet")
	public void loginCheck(String username, String Password) {
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Password);
	}

}
