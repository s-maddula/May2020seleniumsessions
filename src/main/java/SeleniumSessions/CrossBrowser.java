package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowser {
	
	static WebDriver driver;


	public static void main(String[] args) {

		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\maddu\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "/C:\\Users\\maddu\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
	//	else if(browser.equalsIgnoreCase("safari")){
		//	driver = new SafariDriver();
		//}
		
		else{
			System.out.println("Please pass the correct browser name... " + browser);
		}
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
	}
}
