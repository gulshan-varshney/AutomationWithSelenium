package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingGoogleFrames {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in");
		
		driver.switchTo().frame("callout");
		driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("gbwa")).click();
		
		driver.switchTo().frame("app");
		driver.findElement(By.xpath("//span[@data-text='Maps']")).click();
	}
}
