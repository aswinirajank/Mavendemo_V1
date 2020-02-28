package practiceExc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		// Launch in Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		/*
		
		
		//Launch in Edge
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
	
		//Launch in Firefox
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		*/
		
		//Launch in Chromium
				//WebDriverManager.chromiumdriver().setup();
				//WebDriver driver = new ChromiumDriver();
				
				
		driver.get("https://www.google.com//");
		
		
		//driver.close();
		
		
		
		
		
		
		
				
	}

}
