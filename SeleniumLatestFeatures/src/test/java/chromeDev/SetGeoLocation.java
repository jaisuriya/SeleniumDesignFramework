package chromeDev;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v121.emulation.Emulation;

public class SetGeoLocation {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		
		Map<String, Object> coordinates = new HashMap<String, Object>();
		coordinates.put("latitude", 40);
		coordinates.put("longitude", 3);
		coordinates.put("accuracy", 1);

		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("netflix", Keys.ENTER);
		driver.findElements(By.cssSelector(".LC20lb ")).get(0).click();
		String Title = driver.findElement(By.cssSelector(".default-ltr-cache-jmnaey.euy28771")).getText();
        System.out.println(Title);
        
        
        
        
	}

}
