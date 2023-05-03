Feature: This is to test finding items in the cart operation in open cart page


Scenario: Verifying finding items in the cart functionality



Given user opens chrome and enters opencart url
When user click on account and clicks on login
Then user should enter usedid and password
Then user should search iphone 
|Iphone|
Then user should select iphone
|2|
Then user should click add cart
Then uer should clickitemscart
Then user should click on checkout