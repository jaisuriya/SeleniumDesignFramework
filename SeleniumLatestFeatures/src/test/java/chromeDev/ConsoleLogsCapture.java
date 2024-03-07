package chromeDev;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class ConsoleLogsCapture {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//listerners ontestfailures
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.linkText("Browse Products")).click();
		driver.findElement(By.linkText("Selenium")).click();
		driver.findElement(By.cssSelector(".add-to-cart")).click();
		driver.findElement(By.linkText("Cart")).click();
		driver.findElement(By.id("exampleInputEmail1")).clear();
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("2");
		LogEntries entry = driver.manage().logs().get(LogType.BROWSER);// get logentries object
		List<LogEntry> logs = entry.getAll();//LogEntry object - getall method return all logs in list
		for(LogEntry e:logs) //iterating through list and printing each log
		{
			System.out.println(e.getMessage());
		}
	}

}