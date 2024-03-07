package selenium;

import java.time.Duration; 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutorDemo {
    WebDriver driver;
    
    @SuppressWarnings("deprecation")
	void Executor() {
    	  WebDriver driver = new ChromeDriver();
    	  driver.get("https://www.guru99.com/take-screenshot-selenium-webdriver.html");
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	  JavascriptExecutor js = (JavascriptExecutor)driver;
    	  
    	  String domainname = js.executeScript("return document.domain;").toString();
    	  System.out.println("domain name of the site: "+domainname);
    	   
    	  String url = js.executeScript("return document.URL").toString();
    	  System.out.println("url:"+url);
    	  
    	  String title = js.executeScript("return document.title").toString();
    	  System.out.println("title:"+title);
    	  
    	  String innerText = js.executeScript("return document.documentElement.innerText;").toString();
    	  System.out.println("innerText:"+innerText);
    	  
    	  String innerHeight = js.executeScript("return window.innerHeight;").toString();
    	  System.out.println("innerHeight of window: "+innerHeight);
    	  
    	  String innerWidth = js.executeScript("return window.innerWidth;").toString();
    	  System.out.println("innerWidth of window: "+innerWidth);
    	  
//   	  js.executeScript("document.getElementByID('txtuser-name').value='standard_user';");
//   	  js.executeScript("document.getElementByID('txtpassword').value='secret_sauce';");
    	  
    	  js.executeScript("window.scrollBy(0,200)");
    	  js.executeScript("alert('Hello World');");
    }
	public static void main(String[] args) {
        
		
		ExecutorDemo ed = new ExecutorDemo();
        ed.Executor();
	}

}
