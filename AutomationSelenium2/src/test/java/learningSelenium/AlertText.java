package learningSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		driver.findElement(By.xpath("//a[@id='prompt-with-default']")).click();
		String alertText = driver.switchTo().alert().getText();
		String expText ="Enter something";
		if(alertText.equals(expText)) {
			System.out.println("alert text is verified");
		}
		else {
			System.out.println("invalid ");
		}
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
	}

}
