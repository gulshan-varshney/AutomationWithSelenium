package batchExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Zomato {
	@Test
public void zomato() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.zomato.com/india");
	
	driver.findElement(By.xpath("//p[text()='Blinkit']")).click();
	
	driver.findElement(By.xpath("//button[@class='btn location-box mask-button']")).click();
	
	WebElement search = driver.findElement(By.xpath("//div[@class='SearchBar__AnimationWrapper-sc-16lps2d-1 iJnYYS']"));
	search.click();
	
	driver.findElement(By.xpath("//input[@class='SearchBarContainer__Input-sc-hl8pft-3 irVxjq']")).sendKeys("sugar");
	
	driver.findElement(By.xpath("(//div[text()='ADD'])[1]")).click();
	WebElement add = driver.findElement(By.xpath("//div[@class='AddToCart__AddMinusIcon-sc-17ig0e3-9 dtDpfZ']"));
	for (int i = 0; i < 5; i++) {
		add.click();
	}
	
	driver.findElement(By.xpath("//div[text()='r']")).click();
	
	driver.findElement(By.xpath("//div[text()='Login to Proceed']")).click();
}
}
