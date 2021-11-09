package merchantLogin;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class merchantLoginFirefox {
  @Test
  public void verfiedFirefoxLogin() {
		
		FirefoxOptions options = new FirefoxOptions()
			    .setProfile(new FirefoxProfile());
			WebDriver driver = new FirefoxDriver(options);
			options.setLegacy(true);
		
	
	driver.get("https://merchant.vettons.net/");
	
	driver.close();
  }

}