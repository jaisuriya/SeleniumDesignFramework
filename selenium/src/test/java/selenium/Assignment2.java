package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	
	public static void main(String[] args) {
       WebDriver driver = new EdgeDriver();
       driver.manage().window().maximize();
    //   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       driver.get("https://rahulshettyacademy.com/angularpractice/");
       driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Varshaa V");
       driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Varshaa@gmail.com");
       driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("tellmeifyoucan");
       driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    //   System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Check me out if you Love IceCreams!')]")).isEnabled());
       WebElement staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
       Select dropdown = new Select(staticdropdown);
       dropdown.selectByIndex(1);
       driver.findElement(By.id("inlineRadio2")).click();
       driver.findElement(By.name("bday")).sendKeys("19-01-2000");
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

	}

}
