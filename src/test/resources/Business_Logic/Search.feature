Feature: Search functionality

Background: User on serch page
Given user launch  "chrome" browser with exe as "G:\\Automation Support\\chromedriver.exe";	 
Given user open "http://primusbank.qedgetech.com/" application
When user enter "Admin" as username
When user enter "Admin" as password
When user click on Login button


@SmokeTest
Scenario: Search functionality
When user click on search button
When user select "INDIA" as country
When user select "MAHARASTRA" as state
When user select "MUMBAI" as city
When finally user click on  search button
Then application shows list of branches from mumbai city




