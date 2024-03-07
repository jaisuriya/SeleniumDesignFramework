package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
//	WebDriver driver = new ChromeDriver();
//	@SuppressWarnings("deprecation")
//	@Given("browser is open")
//	public void browser_is_open() {
//	   System.out.println("Inside Step - browser is open");
//	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	   driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//	   driver.manage().window().maximize();
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("Inside Step - user is on google search page");
//		
//		driver.navigate().to("https://www.google.com/");
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() {
//		System.out.println("Inside Step - user enters a text in search box");
//		driver.findElement(By.id("APjFqb")).sendKeys("Automation Step by Step");
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//		System.out.println("Inside Step - hits enter");
//		
//		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		System.out.println("Inside Step - user is navigated to search results");
//		driver.getPageSource().contains("Online Courses");
//		driver.quit();
//	}
}
