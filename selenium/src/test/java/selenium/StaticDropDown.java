package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
      WebDriver driver = new ChromeDriver();
	 // WebDriver driver = new EdgeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
      System.out.println(driver.getTitle());
      WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
      Select dropdown = new Select(staticDropdown);
      dropdown.selectByIndex(1);
      System.out.println(dropdown.getFirstSelectedOption().getText());
      Thread.sleep(3000);
      dropdown.selectByVisibleText("USD");
      System.out.println(dropdown.getFirstSelectedOption().getText());
      driver.quit();
	}

}
