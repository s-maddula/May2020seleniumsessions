package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {
 static WebDriver driver;
 
	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
	    driver= new ChromeDriver();
		driver.get("https://www.facebook.com");	
		
		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		
		List<WebElement> daysList = driver.findElements(By.xpath("//Select[@id='day']/option"));
		System.out.println(daysList.size());
		
		for(int i=0; i<daysList.size(); i++) {
			String text = daysList.get(i).getText();
			System.out.println(text);
	// To print values upto 18		
			if(text.equals("18")) {
				daysList.get(i).getText();
				break;
				
		
				
			}
		}
				
			}
}	
		
				
		
		
		
		
		
		
		
		
	


