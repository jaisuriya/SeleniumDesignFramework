package selenium;



import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class TestRahulWebsite {
      WebDriver driver;
      
      public TestRahulWebsite() {
    	  driver = new ChromeDriver();
    	  
      }  
	@SuppressWarnings("deprecation")
	public void url() throws InterruptedException {
    	  driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
    	  driver.manage().window().maximize();
    	  System.out.println(driver.getTitle());
    	  System.out.println(driver.getCurrentUrl());
    	  driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("seleniumtraining");
    	  driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacadem");
    	  driver.findElement(By.id("chkboxOne")).click();
    	  driver.findElement(By.id("chkboxTwo")).click();
    	  driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).submit();
    	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	  System.out.println(driver.findElement(By.cssSelector(".error")).getText());
    	  Thread.sleep(3000);
//    	   driver.findElement(By.xpath("//button[contains(text(),'Log Out')]")).click();
//    	   Thread.sleep(3000);
//    	   driver.quit();
    	  driver.findElement(By.linkText("Forgot your password?")).click();
    	  driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("trainingacademy");
    	  driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("trainingacademy.com");
    	  Thread.sleep(2000);
    	  driver.findElement(By.xpath("//input[@type ='text'][2]")).clear();
    	  driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("seleniumtraining.com");
//    	  driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9025849666");
    	  driver.findElement(By.xpath("//form/input[3]")).sendKeys("9025849666");
    	  driver.findElement(By.xpath("//button[contains(text(),'Reset Login')]")).click();
    	  System.out.println(driver.findElement(By.cssSelector("form p")).getText()); 
    	  Thread.sleep(3000);
    	  driver.findElement(By.xpath("//button[contains(text(),'Go to Login')]")).click();
    	  driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Jayasuriya S");
    	  driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
    	  driver.findElement(By.id("chkboxOne")).click();
    	  driver.findElement(By.id("chkboxTwo")).click();
    	  driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
    	  Thread.sleep(4000);
    	  System.out.println(driver.findElement(By.tagName("p")).getText());
    	  assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
       	  Thread.sleep(3000);
    	  driver.quit();  
          }
	
	      public static void main(String[] args) throws InterruptedException{
		                       TestRahulWebsite trw = new TestRahulWebsite();
	                           trw.url();
	      }
          }
