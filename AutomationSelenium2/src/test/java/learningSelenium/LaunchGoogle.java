package learningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LaunchGoogle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();//launch the browser
		
		driver.get("https://www.google.com");//open the url
		// TODO Auto-generated method stub
		Thread.sleep(2000);//stops the operation for the given specified time
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();//delete all cookies
		Thread.sleep(2000);
		 driver.navigate().to("https://www.facebook.com/");//navigates to the provided URL.
		 Thread.sleep(2000);
		 driver.navigate().refresh(); //refresh the page
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();

	}

}
