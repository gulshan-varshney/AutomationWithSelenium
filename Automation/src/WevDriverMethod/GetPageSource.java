package WevDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 
	driver.get("https://www.flipkart.com");
	
	String source = driver.getPageSource();
	System.out.println(source);
}
}
