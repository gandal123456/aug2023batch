package utility;

public class Calling 
{		
	public static void main(String[] args)
	{		
		//browserLaunch
		   Object[] input1=new Object[2];
		          input1[0]="webdriver.chrome.driver";
		          input1[1]="G:\\Automation Support\\chromedriver.exe";	  
		          SeleniumOperations.browserLaunch(input1);	 	
		          
		//openApplication
		 Object[] input2=new Object[1];
		          input2[0]="http://primusbank.qedgetech.com/";
		          SeleniumOperations.openApp(input2);   
		          
		       //username
		       Object[] input3=new Object[2];
		          input3[0]="//*[@id='txtuId']";
		          input3[1]="Admin";	  
		          SeleniumOperations.sendText(input3);
		          
		   //password
		          Object[] input4=new Object[2];
		          input4[0]="//*[@id='txtPword']";
		          input4[1]="Admin";	  
		          SeleniumOperations.sendText(input4);
		                
	        //click on Login
		          Object[] input5=new Object[1];
		          input5[0]="//*[@id='login']";
		          SeleniumOperations.clickOnElement(input5); 
		          
		          
		   //click on branches
		          Object[] input6=new Object[1];
		          input6[0]="(//*[@height='24'])[2]";
		          SeleniumOperations.clickOnElement(input6); 
		             
		          //select country
		          Object[] input7=new Object[2];
		          input7[0]="//*[@name='lst_countryS']";
		          input7[1]="INDIA";	  
		          SeleniumOperations.dropDown(input7); 
		          
		          //select state
		          Object[] input8=new Object[2];
		          input8[0]="//*[@name='lst_stateS']";
		          input8[1]="MAHARASTRA";	  
		          SeleniumOperations.dropDown(input8); 
		          
		          //select city
		          Object[] input9=new Object[2];
		          input9[0]="//*[@name='lst_cityS']";
		          input9[1]="MUMBAI";	  
		          SeleniumOperations.dropDown(input9); 
		          
		          //click on search
		          Object[] input10=new Object[1];
		          input10[0]="//*[@name='btn_search']";
		          SeleniumOperations.clickOnElement(input10); 
		              
		          
		          
		          
		 
	}
	
	
	

}
