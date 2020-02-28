package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//start writing code Selenium +Java
		
				//1.Launch chrome browser
				
				//System.setProperty("webdriver.chrome.driver", "C:\\AswiniiPivot\\Drivers\\chromedriver.exe");
				
				WebDriverManager.chromedriver().setup();
	
				
				WebDriver driver = new ChromeDriver();
				
				//2.Navigate to application under test AUT
				System.out.println("Before getting page");
				
				driver.get("https://www.google.com//");
				
				System.out.println("After getting page");
				
				//3.Verify Page Title
				
				String ExpectedPageTitle = "Google";
				String ActualPageTitle =driver.getTitle();
				
				System.out.println("ActualPageTitle");
				
				//if(ExpectedPageTitle.equalsIgnoreCase(ActualPageTitle)) {
				
				if(ExpectedPageTitle.equals(ActualPageTitle)) {
					System.out.println("Test case Passed");
				}
					else {
						System.out.println("Test case Passed");
							}
				}
				
				
				//4.Close Browser
	               
	}


