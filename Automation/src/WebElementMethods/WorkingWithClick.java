package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=5cq5s85l71n2s");
		WebElement us = driver.findElement(By.name("username"));
		us.sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		loginBtn.click();
	}
}
