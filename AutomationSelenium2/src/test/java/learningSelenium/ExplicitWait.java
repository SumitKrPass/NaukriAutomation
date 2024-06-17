package learningSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//Enter Email
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sumitpaswan.ece@gmail.com");
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getHeight());
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getWidth());
		
		//ExplicitWait:It is used to halt the execution till the time a particular condition is met or the total time passed.
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("passContainer")));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Sumit@123");
		
		
	}

}
