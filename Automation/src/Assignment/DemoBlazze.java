package Assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazze {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.demoblaze.com/");
		
		driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		driver.findElement(By.xpath("//a[text()='Home ']")).click();
		driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
        Thread.sleep(2000);
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		Thread.sleep(2000);
		
		WebElement price= driver.findElement(By.id("totalp"));
		String actualPrice = price.getText();
		System.out.println(actualPrice);
		
		String expectedPrice = "1180";
		
		if (actualPrice.equals(expectedPrice)) {
			System.out.println("Price matched");
		}
		else {
			System.out.println("price is not matched");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		driver.findElement(By.id("name")).sendKeys("gulshan",Keys.TAB,"India",Keys.TAB,"Pune",Keys.TAB,"1234567890",Keys.TAB,"April",Keys.TAB,"2024");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Purchase']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		driver.quit();
	}
}
