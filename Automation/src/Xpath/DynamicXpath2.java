package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
//	String xpth = "//span[text()='Apple iPhone 13 (128GB) - Starlight']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[@class='a-price-whole']";
//	WebElement price = driver.findElement(By.xpath(xpth));
//	String IphonePrice = price.getText();
//	System.out.println(IphonePrice);

		List<WebElement> product = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> price = driver.findElements(By.className("a-price-whole"));
		for (int i = 0; i < product.size(); i++) {
			System.out.println(product.get(i).getText() + "\t" + price.get(i).getText());
		}
		driver.quit();
	}
}
