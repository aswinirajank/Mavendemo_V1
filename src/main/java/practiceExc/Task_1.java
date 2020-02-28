package practiceExc;

import java.util.concurrent.TimeUnit;

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
		//Question- Chromiundriver could not be resolved.
				//WebDriverManager.chromiumdriver().setup();
				//WebDriver driver = new ChromiumDriver();
				
				
		 driver.get("http://qdpm.net/demo/v9/index.php");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		    String ExpectedPageTitle = "qdPM|Login";
			String ActualPageTitle =driver.getTitle();
			
			
			
			//if(ExpectedPageTitle.equalsIgnoreCase(ActualPageTitle)) {
			
			if(ExpectedPageTitle.equals(ActualPageTitle)) {
				System.out.println("Test case Passed");
			}
				else {
					System.out.println("Test case Passed");
						}
			//Close browser
			driver.close();
			}
		 
				
	}


