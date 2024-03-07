package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Kempegowda International Airport')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Chennai International Airport')]")).click();
		// //a[@value='MAA'] xpath
		// //a[@value='BLR'] xpath
	//	Select dropdown = new Select(dynamicdropdown);
     //   dropdown.selectByIndex(9);
	//	driver.findElement(By.xpath("//a[@value='MAA']")).click();
	}

}
//div[contains(text(),'Chennai International Airport')]