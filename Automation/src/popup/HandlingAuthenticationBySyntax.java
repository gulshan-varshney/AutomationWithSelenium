package popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticationBySyntax {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// syntax of handling authentication popUp
		// protocol://username:password@URL
		
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
	}
}
