package fileUpload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTheFileUploadPopup {

	public static void main(String[] args){
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		
		driver.findElement(By.xpath("//input[@id='fileInput']")).sendKeys("‪C:\\Users\\gulsh\\OneDrive\\Desktop\\GITHUB SELENIUM.txt");
	}
}
