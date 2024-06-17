package learningSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffAllColumns {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://money.rediff.com/gainers");
		List<WebElement> redifList1 = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));
		List<WebElement> redifList2 = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[2]"));
		List<WebElement> redifList3 = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[3]"));
		List<WebElement> redifList4 = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[4]"));
		List<WebElement> redifList5 = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[5]"));
		String str = "Mish Designs";
		for(int i=0;i<redifList1.size();i++) {
			if(redifList1.get(i).getText().equalsIgnoreCase(str)) {
				redifList1.get(i).click();
				System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr//td[2]")).getAttribute("value"));
			}
		}

}
}