package windowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.name("q")).sendKeys("water bottel",Keys.ENTER);
		 driver.findElement(By.xpath("//a[contains(text(),'The Better Home 1000 Water')]")).click();
		 
		 String parentWindowId = driver.getWindowHandle();
		 System.out.println(parentWindowId);
		 
		 Set<String> allWindowId = driver.getWindowHandles();
		 
		 for(String id:allWindowId)
		 {
			 driver.switchTo().window(id);
			 if(driver.getTitle().contains("The Better Home 1000 Water | Rust & Leak Proof 100% Pure Copper 950 ml Bottle"))
			 {
				 break;
			 }
		 }
		 
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		 
		 driver.switchTo().window(parentWindowId);
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='Cart']")).click();
	}
}
