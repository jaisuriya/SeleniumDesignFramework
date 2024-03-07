package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.partialLinkText("Multiple Windows")).click();
		driver.findElement(By.partialLinkText("Click Here")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
        String ParentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
        driver.switchTo().window(ParentId);
        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
      
	}

}
