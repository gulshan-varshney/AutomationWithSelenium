package WevDriverMethod;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RunTimePolymorphim {
 static WebDriver driver;
 public static void main(String[] args) {
	 while (true) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("--Enter Browser name--");
		 String browser = s.next();
	 if (browser.equals("chrome")) {
		 driver=new ChromeDriver();
	}
	 else if (browser.equals("edge")) {
		driver= new EdgeDriver();
	}
	 else {
		System.out.println("invalid browser");
	}
	 driver.get("https://www.flipkart.com");
	 driver.close();
	}
}
 
}
