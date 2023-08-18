package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Loginpage
{
	//Declaration
	
	//Address of email textfield
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailTf;
	
	//Address of password textfield
	@FindBy(xpath="//input[@name='pass']")
	private WebElement passwordTf;

	//Address of login button
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	//Initialization
	public Fb_Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//getter and setter methods

	public WebElement getEmailTf() {
		return emailTf;
	}

	public void setEmailTf(WebElement emailTf) {
		this.emailTf = emailTf;
	}

	public WebElement getPasswordTf() {
		return passwordTf;
	}

	public void setPasswordTf(WebElement passwordTf) {
		this.passwordTf = passwordTf;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	
	//Utilization
	public void emailTextField(String data)
	{
		emailTf.sendKeys(data);
	}
	public void passwordTextField(String data)
	{
		passwordTf.sendKeys(data);
	}
	public void loginButton()
	{
		loginButton.click();
	}
	
}
