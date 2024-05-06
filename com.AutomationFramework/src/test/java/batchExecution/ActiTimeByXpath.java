package batchExecution;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeByXpath {
public static void main(String[] args) throws InterruptedException {
	Random r = new Random();
	int no = r.nextInt(10000);
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://127.0.0.1/login.do;jsessionid=b5750o3ffdriu");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	
	driver.findElement(By.xpath("//a[@class='content users']")).click();
	
	driver.findElement(By.xpath("//input[@value='Create New User']")).click();
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Thor"+no);
	
	String pwd = "Thor@12";
	driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys(pwd+no);
	
	driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys(pwd+no);
	
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Thor"+no);
	
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Loki"+no);
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	
	driver.close();
}
}
