package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations 
{
	public static WebDriver driver=null; 
	//launchBrowser
	   public static void browserLaunch(Object[]inputParameters)
	   {
		   String browserName=(String) inputParameters[0];     //bname  fireFox
		   String strBrowserValue=(String) inputParameters[1];	 //exe
		   
		 if(browserName.equalsIgnoreCase("Chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver",strBrowserValue);				
			   driver=new ChromeDriver();			
				driver.manage().window().maximize(); 
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 }
		 else if(browserName.equalsIgnoreCase("fireFox"))
		 {
			 System.setProperty("webdriver.gecko.driver",strBrowserValue);				
			   driver=new FirefoxDriver();			
				driver.manage().window().maximize();  
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 }
		   
		     
	   }	
	 //openApplication
	   public static void openApp(Object[]inputParameters)
	   {
		  
		   String path=(String) inputParameters[0];		   
		   driver.get(path);
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   }	   
	   //sentText
	   public static void sendText(Object[]inputParameters)
	   {
		   String locator=(String) inputParameters[0];   //xpath
		   String textOnUI=(String) inputParameters[1];		   //Admin
		   driver.findElement(By.xpath(locator)).sendKeys(textOnUI);
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   }	   
        //click	  
	   public static void clickOnElement(Object[]inputParameters)
	   {
		   String locator=(String) inputParameters[0];
		   driver.findElement(By.xpath(locator)).click();
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   }
	   
	   
	   public static void dropDown(Object[]inputParameters)
	    {
		   String locator=(String) inputParameters[0];
		   String text=(String) inputParameters[1];		   
		   Select a=new Select(driver.findElement(By.xpath(locator)));		   
		          a.selectByVisibleText(text);		  
		          driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    }
	   
	   
	   //validation
	   public static void validation(Object[]inputParameters)
	   {
		   
		   String locator=(String) inputParameters[0];   //xpath
		   String text=(String) inputParameters[1];	    //text    Admin
		   
		 String capturedText=driver.findElement(By.xpath(locator)).getText();  //Admin
		   
		   if(text.equalsIgnoreCase(capturedText))
		   {
			   System.out.println("Test case pass");
		   }
		   else
		   {
			   System.out.println("Test case fail");
		   }
		   
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
