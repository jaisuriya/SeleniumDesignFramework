package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_PF {
	@FindBy(xpath = "//button[contains(text(),'Log Out')]")
	WebElement logout;
    WebDriver driver;
	public Homepage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void checllogoutisdisplayed() {
		logout.click();
	}
}
