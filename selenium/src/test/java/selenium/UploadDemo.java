package selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class UploadDemo {
       WebDriver driver;
	
       
       void upload() throws InterruptedException {
    	    WebDriver driver = new ChromeDriver();
		    driver.get("https://the-internet.herokuapp.com/upload");
//		    driver.manage().window().maximize();
		    WebElement choosefile = driver.findElement(By.id("file-upload"));
		    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		    		.withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofMillis(500))
		    		.ignoring(NoSuchElementException.class);
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("file-upload")));	
		    choosefile.sendKeys("C:\\Users\\jayasus\\Desktop\\testing.txt");
		    Thread.sleep(4000);
		    driver.findElement(By.id("file-submit")).click();
		    if(driver.findElement(By.id("uploaded-files")).isDisplayed()){
		    	 System.out.println("File has been uploaded");
		    	 
		    }
		    driver.quit();
		    
		    
	        }	
            }
