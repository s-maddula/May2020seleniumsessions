package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\maddu\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\maddu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();	
	driver.get("http://www.google.com");
	String title=driver.getTitle();
	System.out.println("page title is:" +title);
	if(title.equals("Google")){
		System.out.println("correct title");
	}
	else {
		System.out.println("Incorrect title");
		Thread.sleep(3000);
		driver.quit(); // closing browser
		
		
		
		
	}
	
		
		
	}

}
