package windowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/india");

		driver.findElement(By.xpath("//a[@href='https://in.linkedin.com/company/zomato']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.instagram.com/zomato/']")).click();
		driver.findElement(By.xpath("//a[@href='https://twitter.com/zomato']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/zomato']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/zomato']")).click();
		Set<String> allWindowId = driver.getWindowHandles();
		for(String id:allWindowId)
		{
			driver.switchTo().window(id);
			Thread.sleep(2000);
			String title = driver.getTitle();
			System.out.println(title);
		}
		driver.switchTo().defaultContent().close();
		
		
	}
}
