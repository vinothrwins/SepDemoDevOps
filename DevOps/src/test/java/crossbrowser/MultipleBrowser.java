package crossbrowser;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class MultipleBrowser {
	
  public WebDriver driver;
	
  @Parameters({"browser","url"})
	
  @BeforeClass
  public void launchBrowser(String browser, String url) {	  
	  
	  if(browser.equalsIgnoreCase("chrome")) {
		  
			// Set the system property for the chrome driver
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

			// Creating the object instance for the chrome drive
			driver = new ChromeDriver();
		  
	  }
	  else if(browser.equalsIgnoreCase("firefox")) {
			// Set the system property for the chrome driver
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");

			// Creating the object instance for the chrome drive
			driver = new FirefoxDriver();		
		  
	  }
		// Launch the Application and maximize it
		driver.get(url);		
		driver.manage().window().maximize();	
	  
  }

  @AfterClass
  public void closeApplication() {
	  driver.close();
  }
  
}
