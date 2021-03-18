Feature: Verifying Adactine home page details
Scenario: Verifying Adactine hotel login page with valild crendentials
Given user is on the Adactine page
When user should enter valid userName and passWord
And user should click the login page
Then user should verify the sucess msg

