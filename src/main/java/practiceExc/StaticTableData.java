package practiceExc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTableData {

	@Test
	public void fillInData() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://demo.automationtalks.com/");

		// Fill Vehicle Data
		// DD
		Select makeSelect = new Select(driver.findElement(By.id("make")));
		makeSelect.selectByVisibleText("Audi");
		// DD
		Select modelSelect = new Select(driver.findElement(By.id("model")));
		modelSelect.selectByVisibleText("Moped");

		driver.findElement(By.id("cylindercapacity")).sendKeys("200");
		driver.findElement(By.id("engineperformance")).sendKeys("100");
		// Calender
		driver.findElement(By.id("dateofmanufacture")).sendKeys("01/01/2001");
		
		//DD
		Select seatsDD = new Select(driver.findElement(By.id("numberofseats")));
		seatsDD.selectByVisibleText("8");
		
		//RadioButton
	  String yesnoRB = "No";
	  driver.findElement(By.xpath("//label[text()='" +yesnoRB+ "']")).click();
	  
		
	  //DD no of seats motocycle
	  Select motorseatDD = new Select(driver.findElement(By.id("numberofseatsmotorcycle")));
	  motorseatDD.selectByVisibleText("2");
	  
	  //DD fuel type
	  Select fuelDD = new Select(driver.findElement(By.id("fuel")));
	  fuelDD.selectByVisibleText("Diesel");
	  
	  //Payload 
	  driver.findElement(By.id("payload")).sendKeys("100");
	  
	  //Total weight 
	  
	  driver.findElement(By.id("totalweight")).sendKeys("100");
	  
	  //List price
	  driver.findElement(By.id("listprice")).sendKeys("1000");
	  
	  
	  //Annual Mileage
	  driver.findElement(By.id("annualmileage")).sendKeys("100");
	  
	  // License Plate Number
	  driver.findElement(By.id("licenseplatenumber")).sendKeys("CBN 526");
	  
	  //Next button
	  
	  driver.findElement(By.xpath("//button[@id='nextenterinsurantdata']")).click();
	  
	  //Verify page title
	  String insurantPage=driver.getTitle();
	  Assert.assertEquals(insurantPage, "Fill Insurant Data");
	  
	  //Fill insurant data page-------------------
	  
	  //first name
	  driver.findElement(By.id("firstname")).sendKeys("Aswini");
	  //last name
	  driver.findElement(By.id("lastname")).sendKeys("Rajan");
	  
	  //DOB
	  driver.findElement(By.id("birthdate")).sendKeys("03/19/2000");
	  //GenderCB
	  String gender ="Female";
	 // driver.findElement(By.id("gender")).click();
	  driver.findElement(By.xpath("//label[text()='"+gender+"']")).click();
	  
	  //Street address
	  driver.findElement(By.id("streetaddress")).sendKeys("abcdstreet");
	  
	  //Country DD
	  Select countryDD = new Select(driver.findElement(By.id("country")));
	  countryDD.selectByVisibleText("India");
	  
	  //Zipcode
	  driver.findElement(By.id("zipcode")).sendKeys("980876");
	  
	  //City
	  driver.findElement(By.id("city")).sendKeys("Bangalore");
	  
	  //OccupationDD
	  Select occupationDD = new Select(driver.findElement(By.id("occupation")));
	  occupationDD.selectByVisibleText("Employee");
	  
	  //Hobbies CheckBox  
	  String hobby=" Cliff Diving";
		driver.findElement(By.xpath("//label[text()='"+hobby+"']")).click();
	  //Website
		driver.findElement(By.id("website")).sendKeys("demo.automationtalks.com");
		
		//Picture
		
	  //Next page
	
		driver.findElement(By.id("nextenterproductdata")).click();
		
	  String productPage=driver.getTitle();
	  Assert.assertEquals(productPage, "Fill Product Data");
	  
	  //Fill Product Data
	  
	  driver.findElement(By.id("startdate")).sendKeys("04/12/2021");
	  
	  Select insuranceDD = new Select(driver.findElement(By.id("insurancesum")));
	  insuranceDD.selectByVisibleText("3.000.000,00");
	  
	  Select meritratingDD = new Select(driver.findElement(By.id("meritrating")));
	  meritratingDD.selectByVisibleText("Bonus 1");
	  
	  Select damageDD = new Select(driver.findElement(By.id("damageinsurance")));
	  damageDD.selectByVisibleText("Full Coverage");
	  
	  
	 
	  //Checkbox
	  String optionalCB = "Legal Defense Insurance";
	  
	  driver.findElement(By.xpath("//label[text()='"+optionalCB+"']")).click();
	  
	  
	  driver.findElement(By.id("courtesycar")).sendKeys("No");
	  
	  driver.findElement(By.id("nextselectpriceoption")).click();
	  
	  String optionPage=driver.getTitle();
	  Assert.assertEquals(optionPage, "Choose Price Option");
	  
	  
	  
	  
	  
	  
	}

}
