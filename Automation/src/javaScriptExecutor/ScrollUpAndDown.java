package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/");
		
		//explicit TypeCasting
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//scroll down using executeScript()
		for(int i=0;i<=20;i++)
		{
			js.executeScript("window.scrollBy(0,100);");
			Thread.sleep(50);
		}
		// scroll up
		for(int j=0; j<15; j++)
		{
			js.executeScript("window.scrollBy(0,-100);");
			Thread.sleep(50);
		}
	}
}
