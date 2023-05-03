Feature: This is to test User Registration operation in open cart page


Scenario: Verifying User Registration functionality

Given User is opening chrome browser and entering url
When User is going to Click MyAccount and Select RegisterLink
Then User should able to see Register Account Page
Then User is going to enter FirstName and LastName
Then User is going to enter Email and Telephone
Then User is going to enter Password and ConfrimPassword
Then User should click checkbox for aggreement policy
Then User should click on continue

