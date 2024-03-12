package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsEnabledMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapps.qspiders.com/");
	
	driver.findElement(By.xpath("(//div[text()='Explore more'])[1]")).click();
	
	
	driver.findElement(By.xpath("//li[text()='Disabled']")).click();
	WebElement nameTextField = driver.findElement(By.name("name"));
	System.out.println(nameTextField.isEnabled());
	
	WebElement emailTextField = driver.findElement(By.name("email"));
	System.out.println(emailTextField.isEnabled());
	
	WebElement pwdTextField = driver.findElement(By.name("password"));
	System.out.println(pwdTextField.isEnabled());
}
}
