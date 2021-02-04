package StepDefinitions;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest 
{
	WebDriver driver=null;
	loginPage login;

	@Given("user is on testlogin page")
	public void user_is_on_testlogin_page() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {
		driver.get("https://example.testproject.io/web/");
		login=new loginPage(driver);
		//driver.findElement(By.id("name")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);
		login.enterUserName(username);
		login.enterPassword(password);
	}

	@And("clicks on login or testsubmit button")
	public void clicks_on_login_testsubmit_button() {
		//driver.findElement(By.id("login")).click(); 
		login.clickSubmit();
	}

	@Then("user nagigates to testhomepage")
	public void user_nagigates_to_testhomepage() {
		System.out.println("user nagigates to homepage");
		driver.close();
	}

}
