Feature: This is to test User Registration operation in open cart page


Scenario: Verifying User Registration failure functionality






Given User is opening chrome browser and user entering url
When User is going to Click MyAccount and user is Selecting RegisterLink
Then User should able to see Register Account Page succesfully
Then User is going to enter FirstName and the LastName

Then User should enter Email and Telephone

Then User should enter Password and ConfrimPassword

Then User should click aggrement checkbox 
Then User should click  continue
Then User Should able to see error on telephone textbox