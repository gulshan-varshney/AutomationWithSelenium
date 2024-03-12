package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.netflix.com/in/");
	
	WebElement sign = driver.findElement(By.id("signIn"));
	
	sign.click();
	
	WebElement stb = driver.findElement(By.id("id_userLoginId"));
	
	stb.sendKeys("1234567890");
	
	WebElement pwd = driver.findElement(By.id("id_password"));
	
	pwd.sendKeys("123456");
	
	WebElement button = driver.findElement(By.className("login-button"));
	
	button.click();
}
}
