package batchExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipKartActionClass {

	@Test
	public void Flipkart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(fashion).perform();
		
		driver.findElement(By.xpath("//a[text()='Men Footwear']")).click();
		
		WebElement productName = driver.findElement(By.xpath("(//a[@class='IRpwTa'])[1]"));
		WebElement productPrice = driver.findElement(By.xpath("(//div[@class='_30jeq3'])[1]"));
		System.out.println(productName.getText()+"----->"+productPrice.getText());
		
		driver.findElement(By.xpath("//a[text()='Careers']")).click();
		driver.findElement(By.id("candidate-login-before")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("gulshan@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gulshan@123");
		driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")).click();
		driver.findElement(By.xpath("//button[@class='btn_submit f-w-600']")).click();
	}
}
