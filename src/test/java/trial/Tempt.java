package trial;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tempt 
{

	public static void main(String[] args) 
	{
	
	//browserLaunch
	System.setProperty("webdriver.chrome.driver", "G:\\Automation Support\\chromedriver.exe");	
		
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();

	//openApplication
    driver.get("http://primusbank.qedgetech.com/");
    
    
    //enter username
    driver.findElement(By.xpath("//*[@id='txtuId']")).sendKeys("Admin");            
    
    //enter password
    driver.findElement(By.xpath("//*[@id='txtPword']")).sendKeys("Admin");
	
    //click on Login button
    driver.findElement(By.xpath("//*[@id='login']")).click();	
	
    //click on branches
    driver.findElement(By.xpath("(//*[@width='132'])[1]")).click();	
	
    //select INDIA as country
    //Select MH as state
    //Select Mumbai as a city
    
    //Click On search button
    driver.findElement(By.xpath("//*[@id='login']")).click();	
	
    
    
    
    
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
