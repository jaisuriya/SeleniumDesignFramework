package chromeDev;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v121.network.Network;
import org.openqa.selenium.devtools.v121.network.model.ConnectionType;

public class NetworkSpeed {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devtools.send(Network.emulateNetworkConditions(false, 3000, 20000, 100000, Optional.of(ConnectionType.ETHERNET)));
		devtools.addListener(Network.loadingFailed(), loadingFailed->{
			System.out.println(loadingFailed.getErrorText());
			System.out.println(loadingFailed.getTimestamp());
		});
		long startTime = System.currentTimeMillis();
//		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
//		driver.findElement(By.linkText("Library")).click();
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("netflix", Keys.ENTER);
		driver.findElements(By.cssSelector(".LC20lb ")).get(0).click();
		String Title = driver.findElement(By.cssSelector(".default-ltr-cache-jmnaey.euy28771")).getText();
        System.out.println(Title);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		driver.close();
	}
//135370
}
