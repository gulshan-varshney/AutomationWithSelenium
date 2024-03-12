package WevDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeAndPositon {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	
	Dimension dimention= new Dimension(500, 800);
	driver.manage().window().setSize(dimention);
	
	Point point=new Point(600, 200);
	driver.manage().window().setPosition(point);
	
	driver.get("https://www.google.com");
	 
}
}
