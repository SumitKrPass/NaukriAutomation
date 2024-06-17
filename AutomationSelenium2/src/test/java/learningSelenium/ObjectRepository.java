package learningSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {
	public static void main(String[] args) throws Exception {
		//storing the location of properties file
		File src1 = new File("C:\\Users\\admin\\eclipse-workspace\\AutomationSelenium\\Repository\\config.properties"); 
		File src2 = new File("C:\\Users\\admin\\eclipse-workspace\\AutomationSelenium\\Repository\\locators.properties"); 
		File src3 = new File("C:\\Users\\admin\\eclipse-workspace\\AutomationSelenium\\Repository\\testdata.properties"); 
		
		//FileInputStream loads the file
		FileInputStream config1 = new FileInputStream(src1);
		FileInputStream locators1 = new FileInputStream(src2);
		FileInputStream testdata1 = new FileInputStream(src3);
		
		//properties class reads the properties file
		Properties config2 = new Properties();
		config2.load(config1);
		Properties locators2 = new Properties();
		locators2.load(locators1);
		Properties testdata2 = new Properties();
		testdata2.load(testdata1);
		
		WebDriver driver = new ChromeDriver();
		if(config2.getProperty("maximize", "false").equalsIgnoreCase("true")) {
			driver.manage().window().maximize();
		}
		 int implicitWaitTime = Integer.parseInt(config2.getProperty("implicit.wait"));
		 driver.manage().timeouts().implicitlyWait(implicitWaitTime, TimeUnit.SECONDS);
		driver.get(config2.getProperty("URL"));
		Thread.sleep(2000);
		//Enter Email
		driver.findElement(By.xpath(locators2.getProperty("Email"))).sendKeys(testdata2.getProperty("EmailTD"));
		driver.findElement(By.xpath(locators2.getProperty("pass"))).sendKeys(testdata2.getProperty("passwordTD"));

		
		
		
		
	}

}
