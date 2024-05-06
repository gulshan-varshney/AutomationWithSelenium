package batchExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateInstaLogin {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://www.instagram.com/");
	
	driver.findElement(By.name("username")).sendKeys("1236547890");
	
	driver.findElement(By.name("password")).sendKeys("12345678");
	
	driver.findElement(By.className("_acap")).click();
}
}
