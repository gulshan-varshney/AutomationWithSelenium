package pomPackage;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant{

	static WebDriver driver;
	
	// open the browser
	public void setUp() throws IOException {
		
		Flib lib = new Flib();
		String url = lib.getDataFromPropertyFile(propPath, "url");
		String browser = lib.getDataFromPropertyFile(propPath, "browser");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}else {
			System.out.println("invalid browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeSecond));
		driver.get(url);
	}
	
	// login
//	public void login() throws IOException {
//		
//		Flib lib = new Flib();
//		String username = lib.getDataFromPropertyFile(propPath, "username");
//		String pwd = lib.getDataFromPropertyFile(propPath, "password");
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("pwd")).sendKeys(pwd,Keys.ENTER);
//	}
	// logout
	public void logout() {
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	
	// create user
//	public void createUser() {
//		
//		Random r = new Random();
//		int no = r.nextInt(10000);
//		
//		driver.findElement(By.xpath("(//img[@class='sizer'])[3]")).click();
//		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
//		driver.findElement(By.name("username")).sendKeys("Manager"+no);
//		driver.findElement(By.name("passwordText")).sendKeys("Manager@123");
//		driver.findElement(By.name("passwordTextRetype")).sendKeys("Manager@123");
//		driver.findElement(By.name("firstName")).sendKeys("Captain");
//		driver.findElement(By.name("lastName")).sendKeys("America");
//		driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
		
//	}
	
	// close the browser
	public void tearDown() {
		driver.quit();
	}
}
