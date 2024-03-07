package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PomPage {
     WebDriver driver;
     
     By usernameTXB = By.id("inputUsername");
     By pwdTXB  = By.name("inputPassword");
     By loginbutton = By.className("submit signInBtn");
     
     public PomPage(WebDriver driver) {
    	 this.driver = driver;
     }
     
     public void setusername(String username) {
    	     driver.findElement(usernameTXB).sendKeys(username);
     }
public void setpassword(String pwd) {
    	    driver.findElement(pwdTXB).sendKeys(pwd);
     }
public void clicklogin() {
	
	        driver.findElement(loginbutton).click();
}

public void logintorahulacademy(String username, String pwd) {
	     this.setusername(username);
	     this.setpassword(pwd);
	     this.clicklogin();
	
}

     
 
            }
