
package learningSelenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignup {
	//navigate to facebook
	//click on "create new button" button
	//click on "female" radio button
	//verify that the radio button is enabled
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//launch to browser
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");//welcome to facebook
		//1st Method
		driver.findElement(By.xpath("//a[contains(@id,\'u_0_0\')]")).click();//clicking on create new account button
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@value='1']")).click();//selecting "female"radiobutton
//		System.out.println(driver.findElement(By.xpath("//input[@value='1']")).isEnabled());
		//driver.close();
		//2nd Method(hard code not preferable)
		//Object List;
//		Thread.sleep(2000);
//		List<WebElement> radioButton = driver.findElements(By.xpath("//input[@type='radio']"));
//		System.out.println("Number of radioButtons"+radioButton.size());
//		radioButton.get(0).click();
//		System.out.println(radioButton.get(0).isSelected());
//		driver.close();
		//3rd Method(Most Preferred way)
		List<WebElement> radioButton = driver.findElements(By.xpath("//span[@class='_5k_2 _5dba']"));
		System.out.println("Number of radioButtons"+radioButton.size());//3
		String expectedbutton="Female";
		for(int i=0;i<2;i++) {
			if(radioButton.get(i).getText().equalsIgnoreCase(expectedbutton))
			
			radioButton.get(i).click();
			Thread.sleep(3000);
			System.out.println("Radio Button Clicked");
			
		}
		
		
		
	}

}
