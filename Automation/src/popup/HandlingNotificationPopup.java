package popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingNotificationPopup {

	public static void main(String[] args) {
		
		// handling the notification popUp
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.yatra.com/");
	}
}
