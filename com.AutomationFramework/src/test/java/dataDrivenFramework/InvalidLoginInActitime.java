package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginInActitime {

	public static void main(String[] args) throws IOException {
		
		Flib lib = new Flib();
		String url = lib.getDataFromPropertyFile("./src/test/resources/CommonData.properties", "url");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		int rowCount = lib.getRowCount("./src/test/resources/ActiTimeData.xlsx", "InvalidData");
		
		for(int i=0;i<=rowCount;i++) {
			
			String username = lib.getDataFromExcelFile("./src/test/resources/ActiTimeData.xlsx", "InvalidData", i, 0);
			String password = lib.getDataFromExcelFile("./src/test/resources/ActiTimeData.xlsx", "InvalidData", i, 1);
			
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
		}
	}
}
