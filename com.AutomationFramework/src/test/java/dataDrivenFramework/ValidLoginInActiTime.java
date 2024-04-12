package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginInActiTime {

	public static void main(String[] args) throws IOException {
		String filepath = "./src/test/resources/ActiTimeData.xlsx";
		Flib lib = new Flib();
		String url = lib.getDataFromPropertyFile("./src/test/resources/CommonData.properties", "url");
		String username = lib.getDataFromExcelFile(filepath, "validData", 1, 0);
		String password = lib.getDataFromExcelFile(filepath, "validData", 1, 1);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		driver.findElement(By.name("username")).sendKeys(username,Keys.TAB,password,Keys.ENTER);
	}
}
