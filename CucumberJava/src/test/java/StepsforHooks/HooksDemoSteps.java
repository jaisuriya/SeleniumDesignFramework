package StepsforHooks;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class HooksDemoSteps {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Before(order = 1)
	public void browsersetup() {
		System.out.println("++++++++++++++++++++++++++I am inside Browser Setup+++++++++++++++++++++++");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@Before(order = 0)
	public void setup2() {
		System.out.println("I am inside setup2");
	}
	@After(order = 2)
	public void closedown() {
		System.out.println("+++++++++++++++++++++++++++++I am inside closedown+++++++++++++++++++++++++++++");
		driver.quit();
	}
	@After(order = 1)
	public void closedown2() {
		System.out.println("I am inside closedown2");
	}
	@BeforeStep
	public void beforesteps() {
		System.out.println("I am inside beforestep");
	}
	@AfterStep
	public void aftersteps() {
		System.out.println("I am inside afterstep");
	}
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   
		
		
	}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	 
		
	}
	@And("clicks on login button")
	public void clicks_on_login_button() {
	    
		
	}
	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	    
		
	}
}
