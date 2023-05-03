Feature: This is to test User account update operation in open cart page


Scenario: Verifying User account update functionality

Given user opens chrome and enters open cart url
When user is going to click my account
Then user is going to enter imput user and password
Then user is going to click editacoount link
Then user is going to update Lastname and clicking continue
|syed23|
Then user should able to see account update success status
Then user should click on logout and continue to homepage
