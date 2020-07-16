package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScoreCard {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
			
		driver.navigate().to("https://www.espncricinfo.com/series/14222/scorecard/299004/pakistan-vs-south-africa-1st-test-south-africa-tour-of-pakistan-2007-08");
		Thread.sleep(3000);
		
		
		selectPlayer(driver,"A Nel");
		selectPlayer(driver,"MV Boucher");
		
		System.out.println(	getPlayerWicketDetails(driver,"A Nel"));
		System.out.println(	getPlayerWicketDetails(driver,"MV Boucher"));
		System.out.println(	getPlayerWicketDetails(driver,"AB de Villiers"));
		System.out.println(	getPlayerWicketDetails(driver,"AG Prince"));
		
	//	System.out.println	(getPlayerRuns(driver,"A Nel"));
	//	System.out.println(	getPlayerRuns(driver,"MV Boucher"));
		
	}
		
		public static void selectPlayer(WebDriver driver,String name) {
		driver.findElement(By.xpath("//a[text()='"+name+"']"));
		}
		
		public static String getPlayerWicketDetails(WebDriver driver,String name) {
		return	driver.findElement(By.xpath("//a[text()='"+name+"']//ancestor::td//following-sibling::td/span")).getText();
		}
		
	//	public static String getPlayerRuns(WebDriver driver,String name) {
			//return	driver.findElement(By.xpath("//a[text()='"+name+"']//ancestor::td//following-sibling::td/span")).getText();
		//	}
	
	
	
	

	
	}


