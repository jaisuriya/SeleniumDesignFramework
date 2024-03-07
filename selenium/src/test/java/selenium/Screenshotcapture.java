package selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotcapture {
	       
	WebDriver driver;
 
	       
	public void screenshot() throws Exception {
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.saucedemo.com/");
		   driver.manage().window().maximize();
		   driver.findElement(By.id("user-name")).sendKeys("standard_user");
		   driver.findElement(By.id("password")).sendKeys("secret_sauce");
		   driver.findElement(By.id("login-button")).click();
		   if(driver.findElement(By.xpath("//div[@id='root']")).isDisplayed()){
			   System.out.println("Homepage is displayed");
			   TakesScreenshot(driver,"C:\\\\Users\\\\jayasus\\\\Desktop\\\\test.png");
		   }
	}
	
	
	
	
    private void TakesScreenshot(WebDriver webdriver, String filewithpath)throws Exception  {
    	TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(filewithpath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);
		
	}




	public static void main(String[]args) throws Exception {
	     
	      Screenshotcapture sc = new Screenshotcapture();
	      sc.screenshot();
	  
 }
}
