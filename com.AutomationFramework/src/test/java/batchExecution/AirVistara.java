package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AirVistara {
	
	@Test
	public void airVistara() {
		//launch browser
		WebDriver d= new ChromeDriver();
		//launch webApplication
		d.get("https://www.airvistara.com/in/en");
		// Actual title
		String actual_title= d.getTitle();
		//expected title
		String expected_title= "Book Flights & Check In Online | Vistara";
		//verifying title
		if (actual_title.equals(expected_title)) {
			System.out.println("test case is pass");
		}
		else {
			System.out.println("test case is fail");
		}
	}
}
