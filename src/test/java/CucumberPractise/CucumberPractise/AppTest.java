package CucumberPractise.CucumberPractise;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println("Sample");
    }
    @Test(enabled=false)
    public static void testProgram() throws InterruptedException
    {
    	String path=System.getProperty("user.dir");
    	System.out.println(path);
    	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.google.com");    	
    	System.out.println(driver.getTitle());
    	Thread.sleep(2000);
    	driver.close();
    }
    @Test
    public void testProperties() throws IOException
    {
    	FileReader file=new FileReader("config.properties");
    	Properties prop=new Properties();
    	prop.load(file);
    	String username=prop.getProperty("username");
    	String password=prop.getProperty("password");
    	System.out.println(username+password);
    }
}
