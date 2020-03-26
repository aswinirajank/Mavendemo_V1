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

public class SeleniumExercise4 {

	WebDriver driver = null;

	public void OpenAUT() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://qdpm.net/demo/v9/index.php");
		driver.manage().window().maximize();

	}

	public void LoginCredentials() {

		driver.findElement(By.xpath("//div[@class='input-icon']//input[@name='login[email]']"))
				.sendKeys("administrator@localhost.com");
		driver.findElement(By.xpath("//div[@class='input-icon']//input[@name='login[password]']"))
				.sendKeys("administrator");
		driver.findElement(By.xpath("//button")).click();

	}

	@Test(description = "Common method to verify page title", dependsOnMethods = "VerifyDashboard")
	public void PagetitleVerify() {

		String pagetitle = driver.getTitle();
		Assert.assertEquals(pagetitle, "qdPM | Dashboard");

	}

	@Test(description = "Passing email, password and click on login")
	public void VerifyDashboard() {
		OpenAUT();
		LoginCredentials();

	}

	@Test(description = "verify the options on dashboard")
	public void VerifyOptions() {
		// Dashboard
		String option1 = driver.findElement(By.xpath("//a/span[text()='Dashboard']")).getText();
		System.out.println(option1);
		Assert.assertEquals(option1, "Dashboard");

		// Projects
		String option2 = driver.findElement(By.xpath("//a/span[text()='Projects']")).getText();
		Assert.assertEquals(option2, "Projects");

		// Tasks
		String option3 = driver.findElement(By.xpath("//a/span[text()='Tasks']")).getText();
		Assert.assertEquals(option3, "Tasks");

		// Tickets
		String option4 = driver.findElement(By.xpath("//a/span[text()='Tickets']")).getText();
		Assert.assertEquals(option4, "Tickets");

		// Discussion
		String option5 = driver.findElement(By.xpath("//a/span[text()='Discussions']")).getText();
		Assert.assertEquals(option5, "Discussions");

		// Reports
		String option6 = driver.findElement(By.xpath("//a/span[text()='Reports']")).getText();
		Assert.assertEquals(option6, "Reports");

		// Users
		String option7 = driver.findElement(By.xpath("//a/span[text()='Users']")).getText();
		Assert.assertEquals(option7, "Users");

		// Configuration
		String option8 = driver.findElement(By.xpath("//a/span[text()='Configuration']")).getText();
		Assert.assertEquals(option8, "Configuration");

		// Tools
		String option9 = driver.findElement(By.xpath("//a/span[text()='Tools']")).getText();
		Assert.assertEquals(option9, "Tools");

		// qdpm Extended
		String option10 = driver.findElement(By.xpath("//a/span[text()='qdPM Extended']")).getText();
		Assert.assertEquals(option10, "qdPM Extended");

		// Add Task
		AddTaskButton();

	}

	public void AddTaskButton() {
		// Add Task Button
		driver.findElement(By.xpath("//tbody/tr/td/button[text()='Add Task']")).click();

		// Project DD
		WebElement projectDD = driver.findElement(By.id("form_projects_id"));
		Select project = new Select(projectDD);
		project.selectByValue("1");

		// Call General Tab
		GeneralTab();

	}

	public void GeneralTab() {
		
		
		// Type DD

		// WebElement typeDD= driver.findElement(By.xpath("//label[text()='Type']"));
		WebElement typeDD = driver.findElement(By.id("tasks_tasks_type_id"));
		Select hourlyrate = new Select(typeDD);
		hourlyrate.selectByValue("2");

		driver.findElement(By.id("tasks_name")).sendKeys("abcdtest");

		// Status DD
		WebElement statusDD = driver.findElement(By.id("tasks_tasks_status_id"));
		Select completedstatus = new Select(statusDD);
		completedstatus.selectByValue("5");

		// DD
		WebElement priorityDD = driver.findElement(By.id("tasks_tasks_priority_id"));
		Select priority = new Select(priorityDD);
		priority.selectByValue("3");

		// Label DD
		WebElement labelDD = driver.findElement(By.id("tasks_tasks_label_id"));
		Select label = new Select(labelDD);
		label.selectByValue("6");

		//Select all Checkbox
		driver.findElement(By.id("tasks_assigned_to_1")).click();
		
		//Description text
		// WebElement desc= driver.findElement(By.xpath("//html[@dir='ltr']/body/p/br")).click();
		//WebElement desc = driver.findElement(By.xpath("//body[@contenteditable='true']/p/br/")).sendKeys("abcd");
		
		//desc.sendKeys("abcddesc");
			
		//Created By DD
				
		WebElement createdDD = driver.findElement(By.id("tasks_tasks_type_id"));
		Select author = new Select(createdDD);
		author.selectByValue("3");
		
		
		//click on time
		//driver.findElement(By.xpath("//div[@class='form-body']/ul/li[2]")).click();
	     
		//Save
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
	}
}
