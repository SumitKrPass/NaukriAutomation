package learningSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptUseScroll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//launch to browser
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//JavascriptInterface
		JavascriptExecutor newDriver =  (JavascriptExecutor)driver;
		Thread.sleep(2000);
		newDriver.executeScript("document.getElementById('email').value='abc@gmail.com'");
		Thread.sleep(2000);
		newDriver.executeScript("document.getElementById('pass').value='abcd@123'");
		Thread.sleep(2000);
		newDriver.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		newDriver.executeScript("window.scrollBy(0,-300)");
		
	}

}
