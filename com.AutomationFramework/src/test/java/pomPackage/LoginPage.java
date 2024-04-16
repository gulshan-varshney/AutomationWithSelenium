package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	private WebElement usernameTextField;
	
	@FindBy(name = "pwd")
	private WebElement pwdTextField;
	
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	public WebElement getusernameTextField(){
		return usernameTextField;
	}	
	
	public WebElement getpwdTextField() {
		return pwdTextField;
	}
	
	public WebElement getkeepLoggedInCheckBox() {
		return keepLoggedInCheckBox;	
	}
	
	public WebElement getloginButton() {
		return loginButton;
	}
	
	public void ValidLogin(String username, String password) {
		usernameTextField.sendKeys(username);
		pwdTextField.sendKeys(password);
		loginButton.click();
	}
}
