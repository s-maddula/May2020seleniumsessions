package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrmSignin {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/");
		
		Thread.sleep(2000);
		
	    driver.findElement(By.name("username")).sendKeys("batchautomation");
	    driver.findElement(By.name("password")).sendKeys("test@12345");
    	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
  
    	driver.switchTo().frame(driver.findElement(By.name("mainpanel")));
    	
       driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a")).click();
		
      driver.switchTo().frame(driver.findElement(By.name("mainpanel")));
       
      driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[4]/a") ).click();
		
    	
     
	}              

}
