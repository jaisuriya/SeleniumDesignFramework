package selenium;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {


	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		w.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.cssSelector("div.modal-content"))));
		driver.findElement(By.id("okayBtn")).click();
		WebElement dropdown = driver
				.findElement(By.xpath("//body/div[@id='login']/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/select[1]"));
		Select drop = new Select(dropdown);
		drop.selectByValue("consult");

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		List<WebElement> p = driver.findElements(By.xpath("//div[@class='card h-100']"));
		for (int i = 0; i < p.size(); i++) {

			driver.findElements(By.xpath("//Button[@class='btn btn-info']")).get(i).click();

		}
		//driver.findElement(By.partialLinkText("Checkout")).click();
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
		driver.quit();
		}

}
