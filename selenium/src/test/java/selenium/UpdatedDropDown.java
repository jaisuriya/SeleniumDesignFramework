package selenium;

import static org.testng.Assert.assertFalse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UpdatedDropDown {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_view_date1")).isSelected());
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(3);
		WebElement Dynamicdropdown = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));

		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
//		   int i =1;
//		   while(i<5) { //
//		  driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();  
//		  i++; 
//		 } 
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), "1 Adult");
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

		}
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(), "5 Adult");
		driver.findElement(By.id("btnclosepaxoption")).click();

		Thread.sleep(3000);
		driver.quit();
	}

}
