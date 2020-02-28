package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestInsuranceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Maven WebDriverManger will help set system ptoperties/ setupdriver executables.
		
		 WebDriverManager.chromedriver().setup();
		 
		 // Initialize driver object,launch chromebrowser. 
		 WebDriver driver = new ChromeDriver();
		 
		 // get AUT,navigate
		 //driver.get("https://www.google.com//");
		 driver.get("https://www.amazon.com/ref=nav_logo");
		
		 //maximize window
		 driver.manage().window().maximize();
		 
		 //Synchronize. between AUT and selenium.If Selenium is faster than AUT then page will not open.
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		// driver.close();
	}

}
