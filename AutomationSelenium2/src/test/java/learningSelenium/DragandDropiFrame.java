package learningSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropiFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/droppable/");
		//moved to iframe
		driver.switchTo().frame(0);
		//control goes back to main frame
		//driver.switchTo().parentFrame();
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		//act.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(3000);
		act.dragAndDropBy(drag, 300, 220);
		
		
	}

}
