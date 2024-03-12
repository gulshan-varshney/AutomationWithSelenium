package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChandlerBing {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.switchTo().activeElement().sendKeys("Chandler Bing",Keys.ENTER);
	driver.findElement(By.xpath("//canvas[@class='lNPNe']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).clear();
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Phoebe Buffay",Keys.ENTER);
	driver.findElement(By.xpath("//canvas[@jsname='h797r']")).click();
}
}
