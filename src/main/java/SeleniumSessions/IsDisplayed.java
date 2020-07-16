package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IsDisplayed {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		String browser = "chrome";
		WebDriverFactory wf = new WebDriverFactory();

		WebDriver driver = wf.launchBrowser(browser);
		wf.launchUrl("https://jqueryui.com/draggable/");
		System.out.println(wf.getPageTitle());

		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		By demoframe = By.className("demo-frame");
		By dragmearound = By.id("draggable");

		ElementUtil elementUtil = new ElementUtil(driver);
		boolean Display = elementUtil.doIsDisplayed(dragmearound);

		System.out.println("Element displayed is:" + Display);
	}
}
