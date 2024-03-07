package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Desiredcap {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(ChromeOptions.CAPABILITY,options);
        options.merge(dc);
        
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
                                                                                       
	    }
        }
