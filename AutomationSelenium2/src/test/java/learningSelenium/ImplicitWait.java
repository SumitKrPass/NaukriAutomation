package learningSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//ImplicitWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("how stuff work");
		//Handling AutoSuggestions
		List<WebElement> autoSuggest = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i=0; i<autoSuggest.size();i++) {
			String expextedsuggest = "how stuff works for kids";
			if(autoSuggest.get(i).getText().equalsIgnoreCase(expextedsuggest)) {
				autoSuggest.get(i).click();
			}
		}
		
		
		
		

	}

}
