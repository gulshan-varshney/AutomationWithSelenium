package batchExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebBilling {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.className("ico-login")).click();
	driver.findElement(By.id("Email")).sendKeys("gulshan@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Gulshan@123");
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	driver.findElement(By.partialLinkText("Books")).click();
	driver.findElement(By.xpath("//div[@data-productid='13']/descendant::input[@class='button-2 product-box-add-to-cart-button']")).click();
	driver.findElement(By.className("cart-label")).click();
	driver.findElement(By.id("termsofservice")).click();
	driver.findElement(By.id("checkout")).click();
	driver.findElement(By.id("BillingNewAddress_CountryId"));
	driver.findElement(By.xpath("//option[text()='India']")).click();
	driver.findElement(By.id("BillingNewAddress_City")).sendKeys("5abcdefg");
	driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("xyzabcd");
	driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("123456");
	driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9874563210");
	driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
	driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
	driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
	driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
	driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
	driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
	driver.findElement(By.xpath("//a[text()='Click here for order details.']")).click();
}
}
