package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps 
{
	WebDriver driver;
	@Given("browser is open")
	public void browser_is_open() 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() 
	{
		driver.get("https://www.google.com");
	}

	@When("user enters text in search box")
	public void user_enters_text_in_search_box() 
	{
		driver.findElement(By.name("q")).sendKeys("Automation");;
	}

	@And("Clicks on search button")
	public void clicks_on_search_button() 
	{
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("verify results")
	public void verify_results() 
	{
		driver.getPageSource().contains("Wiki");
		driver.close();
		
	}

}
