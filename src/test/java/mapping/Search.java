package mapping;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperations;

public class Search 
{
	
	
	@When("user click on search button")
	public void user_click_on_search_button() 
	{
		 Object[] input5=new Object[1];
         input5[0]="(//*[@height='24'])[2]";
         SeleniumOperations.clickOnElement(input5); 
	}

	@When("user select {string} as country")
	public void user_select_as_country(String country1)
	{
		 Object[] input1=new Object[2];
         input1[0]="//*[@name='lst_countryS']";
         input1[1]=country1;  
         SeleniumOperations.dropDown(input1); 	
	}

	@When("user select {string} as state")
	public void user_select_as_state(String st)
	{
		 Object[] input1=new Object[2];
         input1[0]="//*[@name='lst_stateS']";
         input1[1]=st;  
         SeleniumOperations.dropDown(input1); 	
	}

	@When("user select {string} as city")
	public void user_select_as_city(String city1) 
	{
		 Object[] input1=new Object[2];
         input1[0]="//*[@name='lst_cityS']";
         input1[1]=city1;  
         SeleniumOperations.dropDown(input1); 	
	}

	@When("finally user click on  search button")
	public void user_click_on() 
	{
		 Object[] input7=new Object[1];
         input7[0]="//*[@name='btn_search']";
         SeleniumOperations.clickOnElement(input7); 
	}

	@Then("application shows list of branches from mumbai city")
	public void application_shows_list_of_branches_from_mumbai_city() 
	{
	   
	}


	
	
	
	

}
