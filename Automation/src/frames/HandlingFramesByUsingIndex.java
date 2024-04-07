package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesByUsingIndex {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		
		//switch the control from main page to frame
		driver.switchTo().frame(0);
		
		// passing value 
		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("9876543210");
	}
}
