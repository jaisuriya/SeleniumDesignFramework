package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class LoginStep {
	
//	WebDriver driver = new ChromeDriver();
//	
//	@SuppressWarnings("deprecation")
//	@Given("browser is open")
//	public void browser_is_open() {
//	   
//	   driver.manage().window().maximize();
//	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		
//		driver.navigate().to("https://www.rahulshettyacademy.com/locatorspractice/");
//	   
//	}
//
//	@When("^user enters(.*)and(.*)$")
//	public void user_enters_the_username_and_password(String username, String password) {
//	    
//	    driver.findElement(By.id("inputUsername")).sendKeys(username);
//	    driver.findElement(By.name("inputPassword")).sendKeys(password);
//	    
//	}
//	
//	@And("user clicks on login")
//	public void user_clicks_on_login() throws InterruptedException {
//	   
//	    driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
//	    Thread.sleep(4000);
//	}
//	
//
//	@Then("user is navigated to the homepage")
//	public void user_is_navigated_to_the_homepage() {
//	    
//	    driver.getPageSource().contains("You are successfully logged in.");
//	    driver.quit();
//	}
}
