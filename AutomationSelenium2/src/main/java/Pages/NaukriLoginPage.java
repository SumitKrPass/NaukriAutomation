package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaukriLoginPage {
	WebDriver driver;
@FindBy(xpath = "//a[@title='Jobseeker Login']")
WebElement firstLoginButton;

@FindBy(xpath = "//input[@class='err-border']")
WebElement emaildIDField;

@FindBy(xpath = "//input[@type='password']")
WebElement passwordField;

@FindBy(xpath = "//div[@class='google']")
WebElement googleSigninButton;

@FindBy(xpath = "//button[@type='submit']")
WebElement secondLoginButton;

@FindBy(xpath = "//div[@class='server-err']")
WebElement errorTestMessage;

@FindBy(xpath = "//div[@data-email='sumitkr.paswan22754@gmail.com']")
WebElement emailID;

@FindBy(xpath="//div[@class='view-profile-wrapper']")
WebElement completeProfileButton;

public NaukriLoginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void fillEmail(String email) {
	emaildIDField.sendKeys(email);
}
public void fillPassword(String password) {
	emaildIDField.sendKeys(password);
}
public void clickFirstLogin() {
	firstLoginButton.click();
}
public void clickSecondLogin() {
	secondLoginButton.click();
}
public boolean isVisibleErr() {
	return errorTestMessage.isDisplayed();
}
public void clickEmail() {
	emailID.click();
}
public boolean isVisibleProfile() {
	return completeProfileButton.isDisplayed();
	}



}
