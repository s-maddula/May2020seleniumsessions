package SeleniumSessions;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HrmLocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.id("Form_submitForm_subdomain")).sendKeys("testpract");
		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("practice");
		driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("testing");
		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("smaddula19@gmail.com");
		driver.findElement(By.id("Form_submitForm_JobTitle")).sendKeys("QA");

		By NoOfEmployees = By.id("Form_submitForm_NoOfEmployees");
		driver.findElement(By.id("Form_submitForm_CompanyName")).sendKeys("QA");
		By industry = By.id("Form_submitForm_Industry");
		driver.findElement(By.id("Form_submitForm_Contact")).sendKeys("8643208185");
		By country = By.id("Form_submitForm_Country");

		doSelectValuesByVisibleText(NoOfEmployees, "16 - 20");
		doSelectValuesByVisibleText(industry, "Travel");
		doSelectValuesByVisibleText(country, "Brazil");

	}

	public static void doSelectValuesByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

	public static void doSelectValuesByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectValuesByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public static WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
}
