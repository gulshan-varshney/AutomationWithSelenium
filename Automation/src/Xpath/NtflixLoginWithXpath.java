package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NtflixLoginWithXpath {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.netflix.com/in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='signIn']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("123654789");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123654");
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
}
}
