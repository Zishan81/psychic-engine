package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver Driver;
	
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MALLO\\Downloads\\chromedriver-new\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

}
}
