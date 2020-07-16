package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitvsClose {

	public static void main(String[] args) {
				
System.setProperty("webdriver.chrome.driver","C:\\Users\\maddu\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//launch browser
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		System.out.println(driver.getTitle());
	}
	//C:\Users\maddu\Downloads\geckodriver-v0.26.0-win32\geckodriver.exe
}
