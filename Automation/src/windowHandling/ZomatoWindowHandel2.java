package windowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoWindowHandel2 {

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
		
		//parent handle
		String zomatoID = driver.getWindowHandle();
		
		// parent as well as child handles
		Set<String> allWindowId = driver.getWindowHandles();
		
		for(String id:allWindowId)
		{
			driver.switchTo().window(id);
			Thread.sleep(2000);
			String title = driver.getTitle();
			if(title.contains("Zomato | LinkedIn") || id.equals(zomatoID))
			{
				
			}
			else
			{
				driver.close();
			}
		}
//		for (String id : allWindowId) {
//			driver.switchTo().window(id);
//			if (driver.getTitle().contains("Zomato | LinkedIn"))
//			{
//				System.out.println(id);
//			}
//			else {
//				driver.close();
//			}
//		}
	}
}
