package toScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		
		//DownCasting
		RemoteWebDriver r = (RemoteWebDriver) driver;
		File src = r.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/swigy.png");
		Files.copy(src, dest);
		
		
		
		
	}
}
