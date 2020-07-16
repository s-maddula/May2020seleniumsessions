package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {

		//geckodriver
		System.setProperty("webdriver.gecko.driver", "/C:\\Users\\maddu\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://www.amazon.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
		
	}

}