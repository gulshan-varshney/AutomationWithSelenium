package keyWordDrivenFramework;

import java.io.IOException;

public class ValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		BaseTest test = new BaseTest();
		test.setUp();
		test.login();
		test.createUser();
		test.logout();
		test.tearDown();
	}
}
