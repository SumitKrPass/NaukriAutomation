
package learningSelenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTabPopupHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//img[@class='banner-image']")).click();
		
		//Handling tab using SET Interface
		Set<String> allWindowId = driver.getWindowHandles();// store alphanumeric ids
		System.out.println(allWindowId);
		Iterator<String> windowId= allWindowId.iterator();
		String win1 =windowId.next(); //1st alphanumeric id
		String win2 = windowId.next();//2nd alphanumiric ID
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(win1);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		
	}

}
