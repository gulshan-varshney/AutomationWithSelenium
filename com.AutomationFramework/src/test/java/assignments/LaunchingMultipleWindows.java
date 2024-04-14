package assignments;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import dataDrivenFramework.Flib;

public class LaunchingMultipleWindows {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		Flib lib = new Flib();
		int rowCount = lib.getRowCount("./src/test/resources/Url.xlsx", "URL");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com");
		
		for(int i=1;i<=rowCount;i++) {
			String url = lib.getDataFromExcelFile("./src/test/resources/Url.xlsx", "URL", i, 0);
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get(url);
		}
		
	}
}
