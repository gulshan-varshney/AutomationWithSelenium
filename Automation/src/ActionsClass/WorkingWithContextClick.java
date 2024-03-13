package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithContextClick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		
		WebElement rightBtn = driver.findElement(By.id("btn30"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(rightBtn).perform();
		
		driver.findElement(By.xpath("//div[contains(text(),'Yes')]")).click();
	}
}
