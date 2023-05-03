Feature: This is to test missing Coupon code operation in open cart page
Scenario: Verifying missing coupon code  functionality


Given user is browser and entering the open cart url
When user is clicking on account and enterning credentials
Then user is clicking on shoppingcart and clicking on applycoupon
||
Then user able to see the error message  in the screen