package example;
		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;


public class NewTest {
	
	WebDriver driver;
  
	// These are parameters passed from the pom.xml
	@Parameters({"browser","url"})
	@Test
	public void f(String browser, String url) {
		System.out.println("Parameter passed is Chrome");
	    driver.get(url);  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Guru99")); 		
  }
  
	//"browser" is the variable from pom.xml
  
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nxs8390\\Documents\\Automation\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();	
  }

}
