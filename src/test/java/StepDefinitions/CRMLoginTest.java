package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class CRMLoginTest 
{
	WebDriver driver;
	@Given("^User is in login page$")
	public void login_to_CRM()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@When("^User enters (.*) and (.*) for CRM$")
	public void enter_user_Credentials(String username,String password)
	{
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}
	@Then("Validate page title")
	public void verify_PageTitle() throws InterruptedException
	{
		String pageTitle=driver.getTitle();
		Assert.assertEquals("Cogmento CRM", pageTitle);

		Thread.sleep(2000);
		driver.close();
	}

}
