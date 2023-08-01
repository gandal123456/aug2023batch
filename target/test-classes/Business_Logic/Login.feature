Feature: Login functionality

Background: User on main page
Given user launch  "chrome" browser with exe as "G:\\Automation Support\\chromedriver.exe";	 
Given user open "http://primusbank.qedgetech.com/" application

@RegressionTest
Scenario: Login functionality with valid credentials
When user enter "Admin" as username
When user enter "Admin" as password
When user click on Login button
Then Application shows user profile to user


