package jayasuriyapractice.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	ExtentReports er;
	@BeforeTest
	public void config() {
		String Filepath = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(Filepath);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
	    er = new ExtentReports();
		er.attachReporter(reporter);
		er.setSystemInfo("Tester", "Jayasuriya");
	}
	@Test
	public void initialDemo() {
		ExtentTest test = er.createTest("Initial Demo");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		test.fail("Result do not match");
		er.flush();
	}

}
