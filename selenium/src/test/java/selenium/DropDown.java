package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDown {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'round trip')]")).isEnabled());
		driver.findElement(By.xpath("//div[contains(text(),'round trip')]")).click();
        System.out.println(driver.findElement(By.xpath("//div[contains(text(),'round trip')]")).isEnabled());
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Bengaluru')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Chennai')]")).click();
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[2]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[6]/div[1]/div[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]")).click();
        for(int i=1;i<5;i++) {
           driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/*[1]")).click();
        }
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[7]/div[2]/div[1]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='react-root']")).isDisplayed());
		Thread.sleep(3000);
		driver.quit();
		}
        }
