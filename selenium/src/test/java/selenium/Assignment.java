package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("input[value='option1']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
        Thread.sleep(3000);
        driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
       // driver.quit();
        }

}
