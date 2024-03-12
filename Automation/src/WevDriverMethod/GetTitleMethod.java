package WevDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
   public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com");
	
	String actual_title= driver.getTitle();
	
	String exp_title="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	
	if (actual_title.equals(exp_title)) {
		System.out.println("test case is pass");
	}else {
		System.out.println("test case is fail");
	}
}
}
