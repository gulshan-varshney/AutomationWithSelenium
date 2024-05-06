package batchExecution;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukri {
public static void main(String[] args) {
	Random r= new Random();
	int no = r.nextInt(1000);
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.naukri.com/");
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	
	driver.findElement(By.id("name")).sendKeys("Gulshan");
	driver.findElement(By.id("email")).sendKeys("gulshan"+no+"@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Gulshan@1234");
	driver.findElement(By.id("mobile")).sendKeys("9875640123");
	driver.findElement(By.xpath("(//div[@class='textWrap'])[2]")).click();
	driver.findElement(By.xpath("//span[text()='Pune']")).click();
	driver.findElement(By.xpath("//i[@class='ico resman-icon resman-icon-check-box']")).click();
	
	WebElement regBtn = driver.findElement(By.xpath("//button[text()='Register now']"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	wait.until(ExpectedConditions.elementToBeClickable(regBtn));
}
}
