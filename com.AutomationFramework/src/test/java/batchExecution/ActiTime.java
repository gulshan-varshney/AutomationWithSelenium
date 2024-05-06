package batchExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("http://127.0.0.1/login.do;jsessionid=qcqqoo329fok");
	
	driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
	
	driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
	
	driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
}
}
