package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	WebDriver driver;
	
	
	//By emailField = By.xpath(" xyz")
	
	@FindBy(id = "email")
	WebElement emailField;
	
	@FindBy(id="pass")
	WebElement passwordField;
	
	@FindBy(name = "login")
	WebElement loginButton;
	
	@FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
	WebElement createNewAccountButton;
	
	@FindBy(xpath = "//div[@aria-label='Your profile'][@role='button']")
	WebElement userprofile;
	
	@FindBy(xpath = "//a[text()='Find your account and log in.']")
	WebElement errortext;
	
	public FacebookLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // page factory do lazy initialization of declared webElement and'this' defines the current instance of class. 
	}
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void enterpassword(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isEmailFieldDisplayed() {
		return emailField.isDisplayed();
	}
	
	public boolean isLoginButtonDisplayed() {
		return loginButton.isDisplayed();
	}
	
	public boolean isPasswordFieldDisplayed() {
		return passwordField.isDisplayed();
	}
	
	public boolean isCreateNewAccountButtonDisplayed() {
		return createNewAccountButton.isDisplayed();
	}
	
	public boolean isUserprofilevisible() {
		return userprofile.isDisplayed();
	}
	
	public boolean iserrormessagevisible() {
		return errortext.isDisplayed();
	
	
	}

}
