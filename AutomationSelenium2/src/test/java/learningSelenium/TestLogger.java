package learningSelenium;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLogger {
	public static Logger log;  //Logger is a interface
	public static void main(String[] args) {
		log = LogManager.getLogger(TestLogger.class); //intializing log
		WebDriver driver = new ChromeDriver();
		log.info("Launching Browser");
		driver.manage().window().maximize();
		log.info("maximizing browser");
		driver.get("https://www.facebook.com");
		log.info("logged in to facebook");
		//Enter Email
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sumitpaswan.ece@gmail.com");
		log.info("email entered");
		
		
		//ExplicitWait:It is used to halt the execution till the time a particular condition is met or the total time passed.
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("passContainer")));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Sumit@123");
		log.info("password entered");
		driver.quit();
		log.info("browser closed");
		}

}
