package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomTest {
	
	static PomPage pompage;

	public static void main(String[] args) {
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
      driver.manage().window().maximize();
      pompage = new PomPage(driver);
      pompage.logintorahulacademy("jayasuriya", "rahulshettyacademy");
      
           
      

	}

}
