package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HrmLocatorConcept {

			public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			
		WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
			
			Thread.sleep(5000);
			driver.manage().window().maximize();
			//Alert alert = driver.switchTo().alert();
		//	alert.accept();
			
			driver.findElement(By.id("Form_submitForm_subdomain")).sendKeys("testpract");
			driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("practice");
			driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("testing");
			driver.findElement(By.id("Form_submitForm_Email")).sendKeys("smaddula19@gmail.com");
			driver.findElement(By.id("Form_submitForm_JobTitle")).sendKeys("QA");
			
			driver.findElement(By.id("Form_submitForm_NoOfEmployees")).sendKeys("0-10");
			driver.findElement(By.id("Form_submitForm_CompanyName")).sendKeys("QA");
			
		//	Select dropdown= new Select (driver.findElement(By.id("Form_submitForm_NoOfEmployees")));
		//	dropdown.selectByVisibleText("0-10"); 
			
		/*	Select dropdown1= new Select (driver.findElement(By.id("Form_submitForm_Industry")));
			dropdown.deselectByVisibleText("Media");
			//driver.findElement(By.id("Form_submitForm_Industry")).sendKeys(""); */
			
			driver.findElement(By.id("Form_submitForm_Industry")).sendKeys("Media"); 

			driver.findElement(By.id("Form_submitForm_Contact")).sendKeys("8643208185");
			driver.findElement(By.id("Form_submitForm_Country")).sendKeys("United States");
			driver.findElement(By.id("Form_submitForm_State")).sendKeys("Texas");
		WebElement checkBox =	driver.findElement(By.id("recaptcha-anchor"));
			checkBox.click();
	//System.out.println("checkBox is selected?"  +checkBox.isSelected());
	
	
	
	}

}
