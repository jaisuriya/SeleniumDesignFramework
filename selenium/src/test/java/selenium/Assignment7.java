package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 600)");
		List<WebElement> rows = driver.findElements(By.cssSelector(".table-display tr"));
		List<WebElement> columns = driver.findElements(By.cssSelector(".table-display th"));
		System.out.println("Number of Rows: " + rows.size());
		System.out.println("Number of Columns: " + columns.size());
		System.out.println("Data present in 2nd row: " + rows.get(2).getText());
		driver.quit();

	}

}
