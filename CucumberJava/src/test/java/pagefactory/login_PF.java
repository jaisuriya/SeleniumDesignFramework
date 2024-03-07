package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_PF {

	WebDriver driver;

	@FindBy(id = "inputUsername")
	WebElement txt_username;

	@FindBy(name = "inputPassword")
	WebElement txt_password;

	@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	WebElement click_button;

	public login_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	public void enterusername(String username) {
		txt_username.sendKeys(username);
	}

	public void enterpassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickbutton() {
		click_button.click();

	}
	
	

	public void loginvaliduser(String username, String password) {
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		click_button.click();
	}
}
