package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;
	
	By txt_username = By.id("inputUsername");
	By txt_password = By.name("inputPassword");
	By btn_login = By.xpath("//button[contains(text(),'Sign In')]");
	By btn_logout = By.xpath("//button[contains(text(),'Log Out')]");
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterusername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterpassword(String password) {
		   driver.findElement(txt_password).sendKeys(password);
		   
	}
	
	public void loginbtn() {
		driver.findElement(btn_login).click();
	}
	
	public void logout() {
		driver.findElement(btn_logout).isDisplayed();
	}
	
	public void loginvaliduser(String username, String Password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(Password);
		driver.findElement(btn_login).click();
		
	}

}
