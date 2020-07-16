package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);

		WebElement Link = driver.findElement(By.className("link"));

		Actions ac = new Actions(driver);

		ac.moveToElement(Link).perform();

		driver.findElement(By.linkText("SpiceClub Members")).click();
		driver.findElement(By.linkText("Member Login")).click();
		driver.quit();

	}
}