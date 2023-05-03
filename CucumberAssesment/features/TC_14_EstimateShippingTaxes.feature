Feature: This is to test Estimation Taxes operation in open cart page


Scenario: Verifying  Estimation Taxes functionality


Given User opening chrome and entering opencart url
Then user going to login page and entering details
Then user clicking on shopping cart 
Then user going to click Estimate shipping & taxes and entering country,region and postal code
|500073|
Then user click on getquote and click on  Flat Shipping Rte and click Apply shipping and  capture the successmessage
Then user clicks on checkout button
Then user enters billing details and click on continue
Then user enters delivering details and click on continue
Then user enters delivery method and clicks on continue
Then user enters COD and tick the check box and clicks on continue
Then user enters Confirm order and clicks on confirm order
