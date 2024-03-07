package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExecutorD {
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	void jsexec() throws InterruptedException {
		     WebDriver driver = new ChromeDriver();
		     driver.get("https://talent.capgemini.com/in");
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		     JavascriptExecutor js = (JavascriptExecutor)driver;
		     
		     String domainName = js.executeScript("return document.domain;").toString();
		     System.out.println("domain name of the site: "+domainName);
		     
		     String domainUrl = js.executeScript("return document.URL; ").toString();
		     System.out.println("domain url name: "+domainUrl);
		     
		     String title = js.executeScript("return document.title;").toString();
		     System.out.println("title of the page: "+title);
		     
		     String innerText = js.executeScript("return document.documentElement.innerText").toString();
		     System.out.println("innerText of the site: "+innerText);
		     
		     String innerHeight = js.executeScript("return window.innerHeight").toString();
		     System.out.println("innerHeight of the site: "+innerHeight);
		     
		     String innerWidth = js.executeScript("return window.innerWidth").toString();
		     System.out.println("innerWeight of the site: "+innerWidth);
		     js.executeScript("history.go(0)");
		     js.executeScript("window.scrollBy(0,300)");
		     js.executeScript("window.location='https://www.guru99.com/take-screenshot-selenium-webdriver.html'");
//		     js.executeScript("alert('hello world')");
//		     Thread.sleep(3000);
//		     driver.quit();
		     
		     
		     
	}

	public static void main(String[] args) throws InterruptedException {
			ExecutorD ed = new ExecutorD();
			ed.jsexec();
			
	}

}
