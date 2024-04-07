package windowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioWindowHandel {
 public static void main(String[] args) throws InterruptedException {
	
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get("https://www.ajio.com/");
	 
	 WebElement search = driver.findElement(By.xpath("//input[@name='searchVal']"));
	 search.sendKeys("shoes",Keys.ENTER);
	 driver.findElement(By.xpath("//div[text()='Smashic Unisex Sneakers']")).click();
	 
	 String parent = driver.getWindowHandle();
	 Set<String> allId = driver.getWindowHandles();
	 
	 for (String id : allId)
	{
		driver.switchTo().window(id);
		if (driver.getTitle().contains("Buy White Sneakers for Men by PUMA Online | Ajio.com"))
		{
			break;
		}
	}
	 driver.findElement(By.xpath("//span[text()='9']")).click();
	 driver.findElement(By.className("ic-pdp-add-cart")).click();
	 
	 driver.switchTo().window(parent);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@class='ic-cart ']")).click();
	 driver.findElement(By.xpath("//button[text()='Proceed to shipping']")).click();
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9876543210");
	 driver.findElement(By.className("login-btn")).click();
	 
}
}
