package JavaPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class ControlStatementsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//WebDriverManager.firefoxdriver().setup();
	//	System.setProperty("webdriver.gecko.driver", value)
        WebDriver driver;
        
        //if else demo
       
        	String browser ="FF";
        	
            if(browser.equals("FF")) {
           // driver = new FirefoxDriver();
            	System.out.println("firefox");
    	}
            else if(browser.equals("chrome")){
            	driver = new ChromeDriver();
        }
            else {
            	System.out.println("Select correct browser");
            	System.exit(0);
            }
            
            
            //switch
            
            switch(browser) {
            case "FF":
            	System.out.println("firefox");
            	break;
            	
            case "Chrome":
            System.out.println("Chrome");
            break;
            
            default:
            	System.out.println("default");
                break;
            	
            }
}
	
}
