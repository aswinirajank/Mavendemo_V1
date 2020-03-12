package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtalks.com");
		driver.manage().window().maximize();
		
		//interact with a particular element of webpage
		//By is a selenium class
		WebElement cylcap = driver.findElement(By.id("cylindercapacity"));
		//enter value to the element
		cylcap.sendKeys("333");
		
		//same as above implementation
	//	driver.findElement(By.id("cylindercapacity")).sendKeys("333");
		
		//find element by xpath
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[3]/input")).click();
		
		//click on product data tab when opening window. inspect element then clik and copy xpath from particular field.
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/nav/ul/li[3]/a")).click();
	}
	

}
