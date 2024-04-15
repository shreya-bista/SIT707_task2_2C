package seleniumops;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dto.AccountInfo;
import pageobject.CreateAccountPage;
import screenshotapi.ScreenshotApi;
import sit707_week2.constants.Constants;


public class SeleniumOperations {
	private WebDriver driver = null;
	private ScreenshotApi screenShotApi = null;
	
	public SeleniumOperations() {
		 System.out.println("Fire up chrome browser.");
         driver = new ChromeDriver();
         System.out.println("Driver info: " + driver);
         
         screenShotApi = new ScreenshotApi(driver);
	}

    public void officeworks_registration_page(AccountInfo accInfo) {
        
        try {
           
        	driver.get(Constants.WEB_URL);
            sleep(5);
            
            CreateAccountPage createAccObject = new CreateAccountPage(driver);

            createAccObject.enterFirstName(accInfo.getFirstName());

            createAccObject.enterLastName(accInfo.getLastName());

            createAccObject.enterPhoneNumber(accInfo.getPhoneNumber());

            createAccObject.enterEmail(accInfo.getEmail());

            createAccObject.enterPassword(accInfo.getPassword());

            createAccObject.enterConfirmPassword(accInfo.getPassword());

            createAccObject.clickCreateAccountButton();

            sleep(30);
            
            try {
				screenShotApi.takeScreenShots();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
                        
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	System.out.println("Shutting down browser");
            if (driver != null) {
                driver.quit();
            }
        }
    }

    public void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}