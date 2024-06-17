package learningSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//launch to browser
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//click on create new account
		driver.findElement(By.xpath("//a[contains(@id,\'u_0_0\')]")).click();
		Thread.sleep(4000);
		//1st way
		List<WebElement> month = driver.findElements(By.xpath("//select[@id='month']//option"));
		Thread.sleep(4000);
		month.get(8).click();
		Thread.sleep(4000);
		for(int i=0; i<month.size(); i++) {
			if(month.get(i).getText().equalsIgnoreCase("Apr")) {
				month.get(i).click();
			}
		}
		//2nd way
		WebElement birthmonth1 =driver.findElement(By.xpath("//select[@id='month']"));
		
		Select birthmonth = new Select(birthmonth1);
		
		
		//3rdway
		birthmonth1.sendKeys("jul");
		//4thway
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");
	}

}
