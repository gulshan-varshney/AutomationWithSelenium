package WevDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
	
	String url = driver.getCurrentUrl();
	
	System.out.println(url);
	
	String exp_url= "https://www.google.com/";
	if (url.equals(exp_url)) {
		System.out.println("url is correct");
	}
	else {
		System.out.println("url is wrong");
	}
}
}
