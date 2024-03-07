package chromeDev;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class cdpCommandTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		Map<String,Object> devicemetrics = new HashMap<String,Object>();
		devicemetrics.put("width", 600);
		devicemetrics.put("height", 1000);
		devicemetrics.put("deviceScaleFactor", 50);
		devicemetrics.put("mobile", true);
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride",devicemetrics);
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Library")).click();

	}

}
