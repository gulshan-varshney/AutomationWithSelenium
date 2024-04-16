package pomPackage;

import java.io.IOException;

public class ValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		BaseTest test = new BaseTest();
		test.setUp();
		
		LoginPage lp = new LoginPage(driver);
		Flib lib = new Flib();
		lp.ValidLogin(lib.getDataFromPropertyFile(propPath, "username"), lib.getDataFromPropertyFile(propPath, "password"));
		test.tearDown();
	}
}
