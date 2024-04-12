package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromPropertyFile {

	public static void main(String[] args) throws IOException {

		// Create the object for fileInputStream class
		FileInputStream fis = new FileInputStream("./testData/CommonData.properties");
		// Create the object of properties class
		Properties prop = new Properties();
		// load the key into test script
		prop.load(fis);
		// use getProperty()
		String url = prop.getProperty("url");
		System.out.println(url);
		String username = prop.getProperty("username");
		String pwd = prop.getProperty("password");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(url);
		driver.findElement(By.className("textField")).sendKeys(username, Keys.TAB, pwd, Keys.ENTER);
	}
}
