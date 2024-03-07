package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		// switch window
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> it = windowhandles.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow);
		driver.get("https://rahulshettyacademy.com/");
		String coursename = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']"))
				.get(1).getText();
		driver.switchTo().window(parentwindow);
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(coursename);
		// get screenshot
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:/Users/jayasus/Pictures/automation.png"));
		
		//Get Height & Width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());

	}

}
