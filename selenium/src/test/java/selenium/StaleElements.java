package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElements {
	
	WebDriver driver;
	
	void handling() throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://the-internet.herokuapp.com/status_codes");
		 driver.manage().window().maximize();
		 List<WebElement> link = driver.findElements(By.cssSelector("li>a"));
		 System.out.println("Total no of links: "+link.size());
		 
		 for(int i=0;i<link.size();i++) {
			      String linkText = link.get(i).getText();
			      link.get(i).click();
			      System.out.println("clicked on link: "+linkText);
			      Thread.sleep(3000);
			      driver.navigate().back();
			      
		 }
		 
	}

	public static void main(String[] args) throws InterruptedException {
		StaleElements se = new StaleElements();
		se.handling();

	}

}
