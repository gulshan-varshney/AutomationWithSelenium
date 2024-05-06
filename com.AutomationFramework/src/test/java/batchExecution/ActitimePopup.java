package batchExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActitimePopup {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=15jxfwddlde0m");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.xpath("(//img[@class='sizer'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("HDFC Bank");
		driver.findElement(By.name("createCustomerSubmit")).click();
		driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
		Thread.sleep(2000);
		
		// handle dropDown with select class
		WebElement dropDown = driver.findElement(By.xpath("//select[@name='customerId']"));
		Select s = new Select(dropDown);
		s.selectByVisibleText("HDFC Bank");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Automation Testing");
		driver.findElement(By.name("createProjectSubmit")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='All']")).click();
		driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
		Thread.sleep(2000);
		
		// handle hiddenDivision popUp
		driver.findElement(By.xpath("//input[@id='deleteButton']")).click();
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
