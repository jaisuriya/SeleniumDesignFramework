package selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class base {

//	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] listneeded = {"Cucumber","Beans","Apple","Brinjal"};
		int j = 0;
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<product.size();i++) {
			String[] name = product.get(i).getText().split("-");
			String nameFormated= name[0].trim();
			List listneededlist = Arrays.asList(listneeded);
			
			
			if(listneededlist.contains(nameFormated)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				
				if(j==listneeded.length) {
					break;
				}
			}
		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("input.promocode"))));
		driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("span.promoInfo"))));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.quit();

	}

}
