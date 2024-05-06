package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PayTm {
public static void main(String[] args) {
	// launch browser
	WebDriver driver= new ChromeDriver();
	//maximize browser
	driver.manage().window().maximize();
	//launch webApp.
	driver.get("https://paytm.com/");
	// current URL
	String actUrl= driver.getCurrentUrl();
	// exp. url
	String expUrl= "https://paytm.com/";
	// actual title
	String actTitle= driver.getTitle();
	// exp. title
	String expTitle= "Paytm: Secure & Fast UPI Payments, Recharge Mobile & Pay Bills";
	// verifying title and url
	if (actUrl.equals(expUrl) && actTitle.equals(expTitle) ) {
		System.out.println("test case is pass");
	} else {
		System.out.println("test case is fail");
	}
}
}
