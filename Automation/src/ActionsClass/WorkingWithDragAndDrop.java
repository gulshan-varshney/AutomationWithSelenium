package ActionsClass;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		
		WebElement drag1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		
		WebElement drag2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		
		WebElement drag3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		
		WebElement drag4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		WebElement drop1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		WebElement drop2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag1, drop1).perform();
		
		act.dragAndDrop(drag2, drop1).perform();
		
		act.dragAndDrop(drag3, drop2).perform();
		
		act.dragAndDrop(drag4, drop2).perform();
	}
}
