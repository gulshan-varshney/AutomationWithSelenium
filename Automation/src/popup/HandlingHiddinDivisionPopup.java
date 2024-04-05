package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingHiddinDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("gulshan",Keys.TAB,"gulshan@gmail.com");
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.xpath("//select[@class='w-[97%] m-2 px-4 h-10 border-2 border-stone-600 rounded-md']"));
		
		Select s = new Select(dd);
		s.selectByVisibleText("Laptop");
		Thread.sleep(2000);
//		WebElement msg = driver.findElement(By.xpath("//textarea[@spellcheck='false']"));
//		msg.click();
//		msg.sendKeys("laptops");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}
}
