package learningSelenium;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoggerTest {
	 private static Logger logger = LogManager.getLogger(LoggerTest.class);
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		logger.info("Chrome Launched");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("wait for 30 seconds");
		driver.get("https://www.myntra.com/");
		logger.info("Logged into Myntra");
		try {
			boolean text = driver.findElement(By.xpath("//a[contains(text(),'Women')]")).isDisplayed();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			logger.error("Exception Occured", new Exception("Element Not Found"));
		}
		finally {driver.quit();
		logger.info("Quitting the driver");
		}
		
	}

}
