package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;

public class screencap {
	WebDriver driver;
	void Capture() throws Exception {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		  driver.manage().window().maximize();
	      driver.findElement(By.id("inputUsername")).sendKeys("jayasuriya");
	      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
	      driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	      Thread.sleep(3000);
	      if(driver.findElement(By.tagName("p")).isDisplayed()){
	    	      System.out.println("Screenshot captured");
	    	      TakesScreenshot(driver,"C:\\Users\\jayasus\\Desktop\\screenshot.png");
	      }
	}

	private void TakesScreenshot(WebDriver webdriver, String filewithpath) throws Exception {
		        
		      TakesScreenshot scr =((TakesScreenshot)webdriver);
		      
		      File scrFile = scr.getScreenshotAs(OutputType.FILE);
		      
		      File DestFile = new File(filewithpath);
		      
		      FileUtils.copyFile(scrFile, DestFile);
		
	}

	public static void main(String[] args) throws Exception {
		 screencap scr = new screencap();
		 scr.Capture();
	}

}
