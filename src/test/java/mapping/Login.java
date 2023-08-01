package mapping;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperations;

public class Login 
{
	
	@Given("user launch  {string} browser with exe as {string};")
	public void user_launch_chrome_browser(String bname,String exe)
	{
		  Object[] input1=new Object[2];
          input1[0]=bname;
          input1[1]=exe;  
          SeleniumOperations.browserLaunch(input1);	 	
	}

	@Given("user open {string} application")
	public void user_open_application(String url)
	{
		 Object[] input2=new Object[1];
         input2[0]=url;
         SeleniumOperations.openApp(input2);   
	}

	@When("user enter {string} as username")
	public void user_enter_as_username(String Admin)
	{
		   Object[] input3=new Object[2];
	          input3[0]="//*[@id='txtuId']";
	          input3[1]=Admin;	  
	          SeleniumOperations.sendText(input3);
	}

	@When("user enter {string} as password")
	public void user_enter_as_password(String pass) 
	{
		  Object[] input4=new Object[2];
          input4[0]="//*[@id='txtPword']";
          input4[1]=pass;	  
          SeleniumOperations.sendText(input4);
                
	}

	@When("user click on Login button")
	public void user_click_on_Login_button()
	{
		 Object[] input5=new Object[1];
         input5[0]="//*[@id='login']";
         SeleniumOperations.clickOnElement(input5); 
	}
	
	@Then("Application shows user profile to user")
	public void application_shows_user_profile_to_user()
	{
		  Object[] input6=new Object[2];
          input6[0]="//*[text()='Admin']";
          input6[1]="Admin";	  
          SeleniumOperations.validation(input6);  
	}


}
