package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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

@FindBy(xpath="//span[@title='Remote']")
WebElement remoteButton;

@FindBy(xpath="//div[text()='For employers']")
WebElement forEmployersButton;

@FindBy(xpath="//a[@title='Employer Login']")
WebElement employerLogin;

@FindBy(xpath="//div[@class='keywordSugg']")
WebElement enterskillsfield;


public NaukriLoginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void fillEmail(String emails) {
	emaildIDField.sendKeys(emails);
}
public void fillPassword(String passwords) {
	emaildIDField.sendKeys(passwords);
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

public boolean remoteButtonValidation() {
	return remoteButton.isDisplayed();
}
public boolean employerLoginvisibility() {
	return employerLogin.isDisplayed();
}
public void hoveredonemployers() {
	Actions hovering = new Actions(driver);
	hovering.moveToElement(forEmployersButton).build().perform();
	hovering.sendKeys(employerLogin,Keys.ENTER).build().perform();
}
public void employerLoginValidation() {
	Actions hovering = new Actions(driver);
	hovering.moveToElement(forEmployersButton).build().perform();
	String actualText = employerLogin.getText();
	String expText = "Employer Login";
	Assert.assertEquals(actualText, expText, "Both are not equal");
}
public boolean enterkillsFeildValidation() {
	return enterskillsfield.isDisplayed();
}

}
