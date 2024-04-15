package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class CreateAccountPage {

	WebDriver driver = null;
	
	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
//	using relative locators to identify firstName in relation to lastName
    By firstNameElement = RelativeLocator.with(By.tagName("input")).above(By.id("lastname"));
    
    By lastNameElement = By.id("lastname");

    By phoneNumberElement = By.id("phoneNumber");

    By emailElement = By.id("email");
    
    By passwordElement = By.id("password");
    
    By confirmPasswordElement = RelativeLocator.with(By.tagName("input")).below(By.id("password"));
    
    By createAccountElement = RelativeLocator.with(By.tagName("button")).above(By.xpath("//p[contains(text(),'Already have an account?')]"));
    
//    By createAccountElement = By.xpath("//button[contains(text(),'Create account')]");



    public void enterFirstName(String firstName) {
    	driver.findElement(firstNameElement).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
    	driver.findElement(lastNameElement).sendKeys(lastName);
    }
    
    public void enterPhoneNumber(String phoneNumber) {
    	driver.findElement(phoneNumberElement).sendKeys(phoneNumber);
    }

    public void enterEmail(String email) {
    	driver.findElement(emailElement).sendKeys(email);
    }
    public void enterPassword(String password) {
    	driver.findElement(passwordElement).sendKeys(password);
    }

    public void enterConfirmPassword(String password) {
    	driver.findElement(confirmPasswordElement).sendKeys(password);
    }
    
    public void clickCreateAccountButton() {
    	driver.findElement(createAccountElement).click();
    }
	
}
