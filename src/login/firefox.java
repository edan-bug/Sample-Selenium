package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class firefox {
	
	@SuppressWarnings("deprecation")
	public static void main(String [] args) {
		
		FirefoxOptions options = new FirefoxOptions()
			    .setProfile(new FirefoxProfile());
			WebDriver driver = new FirefoxDriver(options);
			options.setLegacy(true);
		
	
	driver.get("https://merchant.vettons.net/");

	}
}