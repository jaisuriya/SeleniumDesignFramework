package selenium;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	WebDriver driver;
	
	void javascriptExecutor() throws Exception {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.linkedin.com/feed/?trk=homepage-basic_sign-in-submit");
		 driver.manage().window().maximize();
		 TakesScreenShot(driver,"C:\\\\Users\\\\jayasus\\\\Desktop\\\\capture.png");
		 
	}

	private void TakesScreenShot(WebDriver webdriver, String file) throws Exception {
                 TakesScreenshot scr = ((TakesScreenshot)webdriver);
                 File srcFile = scr.getScreenshotAs(OutputType.FILE);
                 File destFile = new File(file);
                 FileUtils.copyFile(srcFile, destFile);
                 
		
	}

	public static void main(String[] args) throws Exception {
		Demo d = new Demo();
		d.javascriptExecutor();

	}

}
