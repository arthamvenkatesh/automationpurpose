package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"H:\\Selenium Related\\Seleniumsupported drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");


	}

}
