import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class MavenTest 
{
	
	
	WebDriver driver;
	
    @Test
    public void test1() 
    {
        driver.get("https://www.google.co.il/");
    }
    
    @Test
    public void test2() 
    {
        driver.get("https://www.youtube.com/");
    }
    
    @BeforeClass
    public void beforeClass() 
    {
  	    System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); 
    }

    @AfterClass
    public void afterClass() 
    {
        driver.quit();
    }

}
