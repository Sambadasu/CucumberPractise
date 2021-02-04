package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;

	//	By loginPage_username=By.id("name");
	//	By loginPage_password=By.id("password");
	//	By loginPage_submitButton=By.id("login");

	//Element identification using pageFactory
	@FindBy(id="name")
	WebElement loginPage_username;
	@FindBy(id="password")
	WebElement loginPage_password;
	@FindBy(id="login")
	WebElement loginPage_submitButton;


	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUserName(String username)
	{
		loginPage_username.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		loginPage_password.sendKeys(password);
	}
	public void clickSubmit()
	{
		loginPage_submitButton.click();
	}
}
