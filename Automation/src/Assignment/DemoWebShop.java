package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.className("ico-register")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Gulshan");
	driver.findElement(By.id("LastName")).sendKeys("Kumar");
	driver.findElement(By.id("Email")).sendKeys("gulshan@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Gulshan@123");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("Gulshan@123");
	driver.findElement(By.id("register-button")).click();
	
}
}
