package Maven;


	//parallel testing load the page

	import org.openqa.selenium.By;
	import org.openqa.selenium.Platform;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import java.net.URL;
    import java.util.HashMap;

    import org.testng.annotations.Test;
	import org.testng.annotations.DataProvider;
    import utility.Constant;
    import com.browserstack.local.Local;
    
    @Test(dataProvider = "browserStackTestData")
	public class MN00A_LoadSite {
	  
	  String URL = "https://" + Constant.USERNAME + ":" + Constant.AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  String browserstackLocal = System.getenv("BROWSERSTACK_LOCAL");
	  String browserstackLocalIdentifier = System.getenv("BROWSERSTACK_LOCAL_IDENTIFIER");
	  public void openBI(Platform platform, String browserName, String Resolution) throws Exception {
		 
		 
	    
		 
		 DesiredCapabilities caps = new DesiredCapabilities();
		
		
		
		
	    caps.setPlatform(platform);
	    caps.setBrowserName(browserName);
	    caps.setCapability("resolution", Resolution);
	    caps.setCapability("browserstack.debug", true);
	    caps.setCapability("browserstack.local", "true");
	    
	     caps.setCapability("acceptSslCerts", "true");
	    
	     caps.setCapability("browserstack.local", browserstackLocal);
		 caps.setCapability("browserstack.localIdentifier", browserstackLocalIdentifier);
	    
	    caps.setCapability("name", "Boss intergration Page Load Quick");
	    caps.setCapability("acceptSslCerts", "true");
	    
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    
	    
			driver.manage().window().maximize();
			driver.get(Constant.URL);
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
			
		
	    
			
	    driver.quit();
	  }
	  
	  @DataProvider (name = "browserStackTestData", parallel = true)
		public Object[][] getData(){
			  Object[][] testData = Constant.quickset;
			  return testData;
		}
	  
	  
	  
	  
	}

