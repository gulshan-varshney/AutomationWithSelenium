package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCreateNewAccount {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");	
		driver.findElement(By.linkText("Create new account")).click();		
		Thread.sleep(3000);	
		driver.findElement(By.name("firstname")).sendKeys("abcdefgh");	
		driver.findElement(By.name("lastname")).sendKeys("abcdefgh");		
		driver.findElement(By.name("reg_email__")).sendKeys("abcd@gmai.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abcd@gmai.com");		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Abcd@1234");
		driver.findElement(By.xpath("//*[@id=\"day\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"month\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"year\"]/option[29]")).click();
		driver.findElement(By.cssSelector("input[value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
}
}
