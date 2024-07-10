package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PayTmFlightTicket {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://paytm.com/");
	
	driver.findElement(By.xpath("//div[2][@class='_2EGQY']")).click();
	
	
	//enter source
	driver.findElement(By.xpath("//span[@id='srcCity']")).click();
	driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("PNQ");
	
	driver.findElement(By.xpath("//div[contains(text(),'Pune, Maharashtra, India')]")).click();
	
	//enter destination
	driver.findElement(By.xpath("//span[@id='destCode']")).click();
	driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("DEL");
	
	driver.findElement(By.xpath("//div[contains(text(),'Delhi, India')]")).click();
	
	//select date
	driver.findElement(By.id("departureDate")).click();
	driver.findElement(By.xpath("(//div[text()='12'])[2]")).click();
	
	//search flight
	driver.findElement(By.xpath("//button[@class='rippleButton']")).click();
	
	
	//fetch the price
//	WebElement flightPrice = driver.findElement(By.xpath("(//span[text()='View Fare']/ancestor::div[@class='_5Cbbf']/descendant::div[@class='_2MkSl'])[1]"));
//	System.out.println("1st flight's price "+flightPrice.getText());
//	System.out.println("--------------------");
//	
	//Fetch all the flights
//	List<WebElement> allFlights = driver.findElements(By.className("_1gMv6"));
//	for (int i = 0; i < allFlights.size(); i++) {
//		System.out.println(allFlights.get(i).getText());
//		System.out.println("=====================");
//	}
	
	List<WebElement> flightName = driver.findElements(By.xpath("//span[@class='_2cP56']"));
	List<WebElement> flightPrice = driver.findElements(By.xpath("//div[@class='_2MkSl']"));
	
	for (int i = 0; i < flightName.size(); i++) {
		System.out.println(flightName.get(i).getText()+"---->"+flightPrice.get(i).getText());
	}
	driver.quit();
}
}
