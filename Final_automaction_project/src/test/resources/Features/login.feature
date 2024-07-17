
@tag1
Feature: login Pgae automaction for Organice_website


Scenario: check login successful with valid credentials by using (parameterize method)

Given User is on login page
When User entersss valid "<username>" and "<password>"
And clicks on login buttonssss
Then user is navigated to the home page
And Close the browsersss

Examples:
| username | password|
| admin@gmail.com |Admin@123|
| suresh@gmail.com |Suresh@123|
| manikandan@gmail.com |manikandan@123|
| Ravi123@gmail.com |Ravi@123|
| Dhanesh@gmail.com |dhanesh@123|
| manoj00714@gmail.com |12345|
| dinesh@gmail.com  |dinesh@123|
| dojacat@gmail.com |Dojacat@123|
| zoro@gmail.com |Zoro@123|
| manoj@gmail.com |Manoj@123|
| basilahamed46@gmail.com |basil|



#Feature: signup Pgae automaction for organic
@tag2
Scenario: checking signup page for 3 users  by using (parameterize method)


Given User is on signup page
When User enters valid "<name>", "<emailaddress>", "<password>", "<contactnumber>", "<address>"
And clicks on signup button
Then user is navigated to the login page
Then enter login credentials "<emailaddress>", "<password>"
And clicks on login buttonsss
And Close broswer


Examples:
| name | emailaddress | password | contactnumber | address |
| basilahamed | basilahamed46@gmail.com | Hello@12345 | 7397061751 | chennai | 
| ahamed | ahamed46@gmail.com | Eello@12345 | 7397061751 | swizerland | 
| basil | basilahamed@gmail.com | HelEo@12345 | 7397061751 | USA | 







@tag3
Scenario: checking admin login  by using (parameterize method)


Given admin is on login page
When admin enters valid "<username>", "<passwords>"
And clicks on logins button
Then admin is navigated to the admim dashbord
And click curu button
Then check in crud component
And click add button
Then admin in check in add component
When admin in adding the products "<food>","<fooddesc>","<price>"
And Click foodadd button
#Then checking adding product in check in dashbord component
And Close the browserses




Examples:
 
| username | passwords| food | fooddesc | price |
| admin@gmail.com |Admin@123| Chekcing | good food | 123456 |
| admin@gmail.com |Admin@123| checking1 | good food1 | 1234567 |
| admin@gmail.com |Admin@123| Chekcing2 | good food2 | 1234568 |




@tag4
#Sandeep
#12/07/24
#Feature: Ad	min Page automation of Organic store project

  

	Scenario: Check Admin page is successful with valid credentials by using (pom function)

	 Given user is on sign in  page

	 When user enters a valid "<EmailAddress>" and "<password>"

	 And clicks on sign in page

	 Then user is navigated to the admin dashboard page
	 
	 And user  click on CRUD button
	 
#	 Then user click on Delete icon
	 
	 Then user click on back button
	 
	 And user click on Manage Users
	 
#	  Then user click on Delete icon
	 
	 Then user click on back button
	 
	 And  user click on Products
	 
	 Then user click on Add to cart
	 
	 Then User click on back button
	 
	 
	 And close the browser

	 

	 Examples:

	 | EmailAddress | password |

	 | admin@gmail.com | Admin@123 |
	 

@tag5


#Feature: Login page automation of saucedemo application
Scenario: Check login is successful with valid credentials by using (page Factory)

    Given User is on Home page
    #When User click on  about buttonss
    #Then user is navigated to about page
    #And clicks on login buttonss
   
    When User enters valid "<username>" and "<password>"
    And clicks on login button
    Then user is navigated to the OIl page
      And clicks on Oil button
    Then user is navigated to the Vegetables page
     And clicks on VEgetable button
    Then user is navigated to the Pulses page
     And clicks on Pulses button
    Then user is navigated to the Fruits page
     And clicks on Fruits button
    Then user is navigated to the Diary  page
     And clicks on Diary button
    
     And clicks on Logout button
    Then Close the browser
  

    Examples: 
      | username  | password |
     |manoj@gmail.com|Manoj@123|
      
      
#
#
