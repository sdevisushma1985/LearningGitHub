package screenshot.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMTest {

	public static void main(String[] args) throws IOException {
		
		
		// Launch browser
		System.setProperty("webdriver.chrome.driver", "G:\\Softwares\\Selenium Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		// open login page
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		// take screenshot
		captureScreenshot(driver, "loginPage");
		
		// enter username
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		// takescreenshot
		captureScreenshot(driver, "username");
		
		// enter password
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		// take screenshot
		captureScreenshot(driver, "password");
		
		// click on login button
		driver.findElement(By.name("Submit")).click();
		
		// take screenshot
		
		captureScreenshot(driver, "homepage");

	}
	
	public static void captureScreenshot(ChromeDriver driver , String fileName) throws IOException {
		TakesScreenshot screenshot = driver;
		
		File image = 	screenshot.getScreenshotAs(OutputType.FILE);
		
		// copy 
		
		File myFile = new File("C:\\Users\\Shelendra Kumar\\eclipse-workspace\\SeleniumTraining\\Screenshots\\"+fileName+".png");
		
		FileUtils.copyFile(image, myFile);
	}

}
