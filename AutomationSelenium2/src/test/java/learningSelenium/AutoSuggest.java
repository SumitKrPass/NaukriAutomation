package learningSelenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggest {public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("most dangerous");
	List<WebElement> expectedsuggestion = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	for(int i=0;i<expectedsuggestion.size();i++) {
		if(expectedsuggestion.get(i).getText().equalsIgnoreCase("most dangerous player in ipl")) {
			expectedsuggestion.get(i).click();
		}
	}
	
	
}

}
