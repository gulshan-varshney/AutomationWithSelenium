package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSelectDeselect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("file:///C:/Users/gulsh/OneDrive/Desktop/SignUp.html");
	
	WebElement multiDropdown = driver.findElement(By.id("drpdown"));
	
	Select s =new Select(multiDropdown);
	for(int i=1;i<=5;i++) {
		s.selectByIndex(i);
	}
	Thread.sleep(2000);
	for(int i=1;i<=5;i++) {
		s.deselectByIndex(i);
	}
}
}
