package DropDown;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicate {

	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/gulsh/OneDrive/Desktop/dropdown.html");
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		Select s= new Select(dropdown);
		
		List<WebElement> duplicateOption = s.getOptions();
		
		TreeSet<String> set = new TreeSet<String>();
		
		for(int i=0;i<duplicateOption.size();i++) {
			String duplicate = duplicateOption.get(i).getText();
			set.add(duplicate);
		}
		
		for(String options:set) {
			System.out.println(options);
		}
		
		
	}
}
