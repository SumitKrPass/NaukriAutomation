package learningSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflist {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://money.rediff.com/gainers");
		List<WebElement> redifList = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]//a"));
		String selected = "Mish Designs";
		for(int i=0; i<redifList.size();i++) {
			if(redifList.get(i).getText().equalsIgnoreCase(selected)) {
				redifList.get(i).click();
				
			}
		}

}
}