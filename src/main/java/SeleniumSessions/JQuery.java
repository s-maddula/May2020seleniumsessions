package SeleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQuery {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		String browser = "chrome";
		WebDriverFactory wf = new WebDriverFactory();

		WebDriver driver = wf.launchBrowser(browser);
		wf.launchUrl("https://jqueryui.com/draggable/");
		System.out.println(wf.getPageTitle());

		Thread.sleep(2000);

		By Themes = By.linkText("Themes");
		ElementUtil elementUtil = new ElementUtil(driver);

		elementUtil.doClick(Themes);

	}

}

