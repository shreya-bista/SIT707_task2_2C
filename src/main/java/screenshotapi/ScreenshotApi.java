package screenshotapi;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import sit707_week2.constants.Constants;

public class ScreenshotApi {

	WebDriver driver = null;
	
	public ScreenshotApi(WebDriver driver) {
		this.driver = driver;
	}
	
	public void takeScreenShots() {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
			FileUtils.copyFile(screenshotFile, new File(Constants.RESOURCE_FOLDER_PATH+"/screenshots/screenshot.png"));
			System.out.println("Screenshot file path: "+ Constants.RESOURCE_FOLDER_PATH+"/screenshots/screenshot.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
}
