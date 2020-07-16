package SeleniumSessions;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class SelectDateWithoutSelect {
	 static WebDriver driver;
	 
		public static void main(String[] args) {
			
	WebDriverManager.chromedriver().setup();
	// if we want to print one particular date then				
		    driver= new ChromeDriver();
			driver.get("https://www.facebook.com");	
			String dob = "18-nov-1982";
			
			By day = By.id("day");
			By month = By.id("month");
			By year = By.id("year");
			
			By daysOptions =(By.xpath("//Select[@id='day']/option"));
			By monthOptions =(By.xpath("//Select[@id='month']/option"));
			By yearOptions =(By.xpath("//Select[@id='year']/option"));
		
			
	 selectValuesFromDropDown(driver, daysOptions, "18");	
	selectValuesFromDropDown(driver, monthOptions, "Nov");	
	selectValuesFromDropDown(driver, yearOptions, "1982");	
	
	// by using split format 
	selectValuesFromDropDown(driver, daysOptions, dob.split("-")[0]);	
	selectValuesFromDropDown(driver, monthOptions, dob.split("-")[1]);	
	selectValuesFromDropDown(driver, yearOptions, dob.split("-")[2]);	
	
	
	}
			 
	public static void selectValuesFromDropDown(WebDriver driver, By locator, String value) {
		List<WebElement> daysList = driver.findElements(locator);
		
		for(int i=0; i<daysList.size(); i++) {
			String text = daysList.get(i).getText();
			//System.out.println(text);
			
			if(text.equals(value)) {
				daysList.get(i).click();
				break;
				
		
			}}	
		
	}
	}


