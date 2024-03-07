package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class uploadDownload {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/upload-download-test/index.html");
		//download excel file from above link
		driver.findElement(By.cssSelector("#downloadButton")).click();
		//upload
		WebElement upload = driver.findElement(By.cssSelector("input[type='file']"));
		upload.sendKeys("C:/Users/jayasus/Downloads/download.xlsx");
		By toastLocator = By.cssSelector(".Toastify_toast-body div:nth-child(2)");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));
		String toastText= driver.findElement(toastLocator).getText();
		System.out.println(toastText);
		Assert.assertEquals("Updated Excel Data Successfully.",toastText);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastLocator));
		

	}

}
