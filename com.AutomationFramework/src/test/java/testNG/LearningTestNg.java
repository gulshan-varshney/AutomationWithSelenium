package testNG;

import org.testng.annotations.Test;
public class LearningTestNg {
	
	@Test
	public void register() {
		System.out.println("register successful");
	}

	@Test(enabled = false)
	public void loginTest() {
		System.out.println("loginTest successfull");
	}
	
	@Test(priority = -3)
	public void addToCart() {
		System.out.println("add to cart successfull");
	}
	@Test(priority = -4)
	public void logout() {
		System.out.println("logout successfull");
	}
}
