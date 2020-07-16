package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchAssignment {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");

		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println("total number of suggestions in search box are..." + list.size());
// To print all the suggestions
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
// to select a particular suggestion
			if (list.get(i).getText().contains("selenium webdriver")) {
				list.get(i).click();
				break;
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}	
		
	}

}

