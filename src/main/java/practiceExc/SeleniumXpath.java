package practiceExc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://services.smartbear.com/samples/TestComplete14/smartstore/");
		driver.manage().window().maximize();
		/// html/body/div[1]/div[2]/header/div[2]/div/div/div[2]/div/div[2]/a
//	    driver.findElement(By.xpath("/html/body/div[1]/div[2]/header/div[2]/div/div/div[2]/div/div[2]/a")).click();
		/// html/body/div[1]/div[2]/div/section/div/div/div/div/div[2]/article[1]/div[1]/a
		// driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section/div/div/div/div/div[2]/article[1]/div[1]/a")).click();
		// Click on login
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/header/div[1]/div/nav/nav[4]/div/a")).click();
		// click on register and enter values.
		WebElement regpath = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div/section/div/div/div/div[2]/div[2]/div[2]/div/div/a"));
		regpath.click();
		// next we need to find each element and then send values to each element
		// regpath.sendKeys(keysToSend);
		// radio button gender-male
		driver.findElement(By.id("gender-male")).click();
		// driver.findElement(By.id("gender-female")).click();

		// first name
		WebElement firstname = driver.findElement(By.id("FirstName"));
		firstname.click();
		firstname.sendKeys("John");

		// last name
		WebElement lastname = driver.findElement(By.id("LastName"));
		lastname.click();
		lastname.sendKeys("Hauge");

		// DOB
		// drop down

		// WebElement date =
		// driver.findElement(By.xpath(//div[text()='data-valmsg-replace']));
/*
		WebElement date = driver.findElement(By.xpath("//div[text() ='data-valmsg-replace']"));
		// Declare the drop-down element as an instance of the Select class
		date.click();
         Select drpDate = new Select(date);
        // drpDate.selectByValue("13");
        // drpDate.selectByIndex(13);
         drpDate.selectByVisibleText("13");
         
    */     
         //email enter my email
         WebElement email = driver.findElement(By.id("Email"));
         email.click();
         email.sendKeys("abcdtest@gmail.com");
         
         
         //Username
         
         WebElement user = driver.findElement(By.id("Username"));
         user.click();
         user.sendKeys("aswiniseltest");
         
         
         //password
         WebElement password = driver.findElement(By.id("Password"));
         password.click();
         password.sendKeys("aswinisel");
         
         
         //confirm password
         WebElement confirmpassword = driver.findElement(By.id("ConfirmPassword"));
         confirmpassword.click();
         confirmpassword.sendKeys("aswinisel");
         
         //Question
         //Is there a check I need to implement for confirming password and confirm password are the same
         
         //company
         WebElement company = driver.findElement(By.id("Company"));
         company.click();
         company.sendKeys("iPivot");
         
         //checkbox
         WebElement newsletter = driver.findElement(By.id("Newsletter"));
         newsletter.click();
         
         //register button
         WebElement register = driver.findElement(By.name("register-button"));
         /*ubmit buttons are used to submit the entire form to the server. 
          * We can either use the click () method on the web element like a normal button as we have done above or use the submit () method on any web element in the form or on the submit button itself.
          * When submit() is used, WebDriver will look up the DOM to know which form the element belongs to, and then trigger its submit function.
          */
         register.submit();
         
         //continue button.
         WebElement continuebutton = driver.findElement(By.xpath("//a[@href='/samples/TestComplete14/smartstore/']"));
        		
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         continuebutton.click();
         
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.close();
         
         
	}

}
