Feature: This is to test Applying Couponcode operation in open cart page
Scenario: Verifying Adding Cart functionality


Given User is initializing the browser and entering the open cart url
When user is going to click on account and enter login details
Then user is going to mouseover and select the laptops
Then user is going to select the hp laptop
Then user going to enter date and quantity
|2021-15-07|2|
Then user going to click add cart button and click shopping cart
Then user is going to apply coupon code
|110011|