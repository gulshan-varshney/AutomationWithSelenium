package batchExecution;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreeSetDropdown {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/gulsh/OneDrive/Desktop/dropdown.html");
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		Select s1 = new Select(dropdown);
		
		List<WebElement> opt = s1.getOptions();
		
		TreeSet<String> t1= new TreeSet<String>();
		
		for(int i=0;i<opt.size();i++) {
			String option = opt.get(i).getText();
			t1.add(option);
		}
		System.out.println(t1);
	}
}
