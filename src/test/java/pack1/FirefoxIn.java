package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"H:\\Selenium Related\\Seleniumsupported drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.yahoomail.com");
	}

}
