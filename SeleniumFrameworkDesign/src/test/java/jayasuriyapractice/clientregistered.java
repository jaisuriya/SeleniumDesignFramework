package jayasuriyapractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class clientregistered {
 @SuppressWarnings("deprecation")
public static void main(String[] args) throws IOException, InterruptedException {
	 
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://rahulshettyacademy.com/client");
	driver.findElement(By.xpath("//a[contains(text(),'Register here')]")).click();
	driver.findElement(By.id("firstName")).sendKeys("Jaya");
	driver.findElement(By.id("lastName")).sendKeys("Suriya");
	driver.findElement(By.id("userEmail")).sendKeys("jayasuriyaqa@automation.com");
	driver.findElement(By.id("userMobile")).sendKeys("9876543210");
	Select drpOccupation = new Select(driver.findElement(By.xpath("//select[@formcontrolname='occupation']")));
	drpOccupation.selectByVisibleText("Engineer");
	driver.findElement(By.xpath("//input[@value='Male']")).click();
	driver.findElement(By.id("userPassword")).sendKeys("Qa@automation2");
	driver.findElement(By.id("confirmPassword")).sendKeys("Qa@automation2");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scr,new File("C:/Users/jayasus/Pictures/register.png"));
	Thread.sleep(2000);
	driver.findElement(By.id("login")).click();
	
}
}
