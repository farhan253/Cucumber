$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TC_01_OpenCartUserRegistration.feature");
formatter.feature({
  "line": 1,
  "name": "This is to test User Registration operation in open cart page",
  "description": "",
  "id": "this-is-to-test-user-registration-operation-in-open-cart-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verifying User Registration functionality",
  "description": "",
  "id": "this-is-to-test-user-registration-operation-in-open-cart-page;verifying-user-registration-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is opening chrome browser and entering url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User is going to Click MyAccount and Select RegisterLink",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should able to see Register Account Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User is going to enter FirstName and LastName",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User is going to enter Email and Telephone",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User is going to enter Password and ConfrimPassword",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User should click checkbox for aggreement policy",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User should click on continue",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_01_UserRegistrationStepDefinitions.user_is_opening_chrome_browser_and_entering_url()"
});
formatter.result({
  "duration": 10014525800,
  "status": "passed"
});
formatter.match({
  "location": "TC_01_UserRegistrationStepDefinitions.user_is_going_to_click_myaccount_and_select_registerlink()"
});
formatter.result({
  "duration": 1644424200,
  "status": "passed"
});
formatter.match({
  "location": "TC_01_UserRegistrationStepDefinitions.user_should_able_to_see_register_account_page()"
});
formatter.result({
  "duration": 13182800,
  "status": "passed"
});
formatter.match({
  "location": "TC_01_UserRegistrationStepDefinitions.user_is_going_to_enter_firstname_and_lastname()"
});
formatter.result({
  "duration": 3237619100,
  "status": "passed"
});
formatter.match({
  "location": "TC_01_UserRegistrationStepDefinitions.user_is_going_to_enter_email_and_telephone()"
});
formatter.result({
  "duration": 393764500,
  "status": "passed"
});
formatter.match({
  "location": "TC_01_UserRegistrationStepDefinitions.user_is_going_to_enter_password_and_confrimpassword()"
});
formatter.result({
  "duration": 350317100,
  "status": "passed"
});
formatter.match({
  "location": "TC_01_UserRegistrationStepDefinitions.user_should_click_checkbox_for_aggreement_policy()"
});
formatter.result({
  "duration": 100908800,
  "status": "passed"
});
formatter.match({
  "location": "TC_01_UserRegistrationStepDefinitions.user_should_click_on_continue()"
});
formatter.result({
  "duration": 1412954700,
  "status": "passed"
});
formatter.after({
  "duration": 619800,
  "status": "passed"
});
formatter.after({
  "duration": 980966500,
  "status": "passed"
});
formatter.uri("TC_02_UserRegistrationFailure.feature");
formatter.feature({
  "line": 1,
  "name": "This is to test User Registration operation in open cart page",
  "description": "",
  "id": "this-is-to-test-user-registration-operation-in-open-cart-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verifying User Registration failure functionality",
  "description": "",
  "id": "this-is-to-test-user-registration-operation-in-open-cart-page;verifying-user-registration-failure-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "User is opening chrome browser and user entering url",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User is going to Click MyAccount and user is Selecting RegisterLink",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should able to see Register Account Page succesfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User is going to enter FirstName and the LastName",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User should enter Email and Telephone",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User should enter Password and ConfrimPassword",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User should click aggrement checkbox",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User should click  continue",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User Should able to see error on telephone textbox",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_02_UserRegistrationFailureStepDefinitions.user_is_opening_chrome_browser_and_user_entering_url()"
});
formatter.result({
  "duration": 7682230700,
  "status": "passed"
});
formatter.match({
  "location": "TC_02_UserRegistrationFailureStepDefinitions.user_is_going_to_click_myaccount_and_user_is_selecting_registerlink()"
});
formatter.result({
  "duration": 1564573300,
  "status": "passed"
});
formatter.match({
  "location": "TC_02_UserRegistrationFailureStepDefinitions.user_should_able_to_see_register_account_page_succesfully()"
});
formatter.result({
  "duration": 16559000,
  "status": "passed"
});
formatter.match({
  "location": "TC_02_UserRegistrationFailureStepDefinitions.user_is_going_to_enter_firstname_and_the_lastname()"
});
formatter.result({
  "duration": 383407300,
  "status": "passed"
});
formatter.match({
  "location": "TC_02_UserRegistrationFailureStepDefinitions.user_should_enter_email_and_telephone()"
});
formatter.result({
  "duration": 457738200,
  "status": "passed"
});
formatter.match({
  "location": "TC_02_UserRegistrationFailureStepDefinitions.user_should_enter_password_and_confrimpassword()"
});
formatter.result({
  "duration": 399934000,
  "status": "passed"
});
formatter.match({
  "location": "TC_02_UserRegistrationFailureStepDefinitions.user_should_click_aggrement_checkbox()"
});
formatter.result({
  "duration": 126692300,
  "status": "passed"
});
formatter.match({
  "location": "TC_02_UserRegistrationFailureStepDefinitions.user_should_click_continue()"
});
formatter.result({
  "duration": 1445022400,
  "status": "passed"
});
formatter.match({
  "location": "TC_02_UserRegistrationFailureStepDefinitions.user_should_able_to_see_error_on_telephone_textbox()"
});
formatter.result({
  "duration": 612383300,
  "status": "passed"
});
formatter.after({
  "duration": 309200,
  "status": "passed"
});
formatter.after({
  "duration": 861875800,
  "status": "passed"
});
formatter.uri("TC_03_OpenCartLogin.feature");
formatter.feature({
  "line": 1,
  "name": "This is to test Login operation in open cart page",
  "description": "",
  "id": "this-is-to-test-login-operation-in-open-cart-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verifying Login functionality",
  "description": "",
  "id": "this-is-to-test-login-operation-in-open-cart-page;verifying-login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User should open chrome and enter URL",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user is going to click and Select Login",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should able to see Login page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User going to enter UserEmailId",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User going to enter UserPassword",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User going to click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User should able to see Logout after succesfull login",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_03_UserLoginFunctionalityStepDefinition.user_should_open_chrome_and_enter_url()"
});
formatter.result({
  "duration": 6321474300,
  "status": "passed"
});
formatter.match({
  "location": "TC_03_UserLoginFunctionalityStepDefinition.user_is_going_to_click_and_select_login()"
});
formatter.result({
  "duration": 1613682200,
  "status": "passed"
});
formatter.match({
  "location": "TC_03_UserLoginFunctionalityStepDefinition.user_should_able_to_see_Login_page()"
});
formatter.result({
  "duration": 7337400,
  "status": "passed"
});
formatter.match({
  "location": "TC_03_UserLoginFunctionalityStepDefinition.user_going_to_enter_useremailid()"
});
formatter.result({
  "duration": 240087500,
  "status": "passed"
});
formatter.match({
  "location": "TC_03_UserLoginFunctionalityStepDefinition.user_going_to_enter_userpassword()"
});
formatter.result({
  "duration": 155139000,
  "status": "passed"
});
formatter.match({
  "location": "TC_03_UserLoginFunctionalityStepDefinition.user_going_to_click_on_login_button()"
});
formatter.result({
  "duration": 2655282100,
  "status": "passed"
});
formatter.match({
  "location": "TC_03_UserLoginFunctionalityStepDefinition.user_should_able_to_see_logout_after_succesfull_login()"
});
formatter.result({
  "duration": 239167100,
  "status": "passed"
});
formatter.after({
  "duration": 381400,
  "status": "passed"
});
formatter.after({
  "duration": 1263759800,
  "status": "passed"
});
formatter.uri("TC_04_OpenCartTitle.feature");
formatter.feature({
  "line": 2,
  "name": "This is to test to verify Title  in open cart page",
  "description": "",
  "id": "this-is-to-test-to-verify-title--in-open-cart-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Verifying open cart Title functionality",
  "description": "",
  "id": "this-is-to-test-to-verify-title--in-open-cart-page;verifying-open-cart-title-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User should open chrome and enter open cart URL",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User should click on my account link and select Login link",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User should enter UserID and password",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is able to verify the title of that opeancart homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_04_OpenCartHomePageTitleStepDefinition.user_should_open_chrome_and_enter_open_cart_url()"
});
formatter.result({
  "duration": 6807837600,
  "status": "passed"
});
formatter.match({
  "location": "TC_04_OpenCartHomePageTitleStepDefinition.user_should_click_on_my_account_link_and_select_login_link()"
});
formatter.result({
  "duration": 1463683500,
  "status": "passed"
});
formatter.match({
  "location": "TC_04_OpenCartHomePageTitleStepDefinition.user_should_enter_UserID_and_password()"
});
formatter.result({
  "duration": 370852200,
  "status": "passed"
});
formatter.match({
  "location": "TC_04_OpenCartHomePageTitleStepDefinition.user_is_able_to_verify_the_title_of_that_opeancart_homepage()"
});
formatter.result({
  "duration": 15422800,
  "status": "passed"
});
formatter.after({
  "duration": 382600,
  "status": "passed"
});
formatter.after({
  "duration": 1868235600,
  "status": "passed"
});
formatter.uri("TC_05_AddingCart.feature");
formatter.feature({
  "line": 1,
  "name": "This is to test Adding Cart operation in open cart page",
  "description": "",
  "id": "this-is-to-test-adding-cart-operation-in-open-cart-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verifying Adding Cart functionality",
  "description": "",
  "id": "this-is-to-test-adding-cart-operation-in-open-cart-page;verifying-adding-cart-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User should open chromebrowser and able to enter open cart URL",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User should able to  click on my account link and select Login link",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User should enter UserID and password with excel data",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User should click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User should able to mouse over the element on desktop dropdown TAB",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User should click Mac",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User should able to add the item into cart",
  "keyword": "Then "
});
formatter.match({
  "location": "TC_05_AddingItemInCartStepDefinitions.user_should_open_chromebrowser_and_able_to_enter_open_cart_url()"
});
formatter.result({
  "duration": 6410151300,
  "status": "passed"
});
formatter.match({
  "location": "TC_05_AddingItemInCartStepDefinitions.user_should_able_to_click_on_my_account_link_and_select_login_link()"
});
formatter.result({
  "duration": 1769079500,
  "status": "passed"
});
formatter.match({
  "location": "TC_05_AddingItemInCartStepDefinitions.user_should_enter_UserID_and_password_with_excel_data()"
});
formatter.result({
  "duration": 395108000,
  "status": "passed"
});
formatter.match({
  "location": "TC_05_AddingItemInCartStepDefinitions.user_should_click_on_Login_button()"
});
formatter.result({
  "duration": 2551570700,
  "status": "passed"
});
formatter.match({
  "location": "TC_05_AddingItemInCartStepDefinitions.user_should_able_to_mouse_over_the_element_on_desktop_dropdown_tab()"
});
formatter.result({
  "duration": 209345500,
  "status": "passed"
});
formatter.match({
  "location": "TC_05_AddingItemInCartStepDefinitions.user_should_click_mac()"
});
formatter.result({
  "duration": 1573960400,
  "status": "passed"
});
formatter.match({
  "location": "TC_05_AddingItemInCartStepDefinitions.user_should_able_to_add_the_item_into_cart()"
});
formatter.result({
  "duration": 3895947300,
  "status": "passed"
});
formatter.after({
  "duration": 348600,
  "status": "passed"
});
formatter.after({
  "duration": 1014075700,
  "status": "passed"
});
formatter.uri("TC_06_OrderPlacementGuestCheckout.feature");
formatter.feature({
  "line": 1,
  "name": "Order Placement with guest checkout",
  "description": "",
  "id": "order-placement-with-guest-checkout",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify user can able to place order using guestaccount",
  "description": "",
  "id": "order-placement-with-guest-checkout;verify-user-can-able-to-place-order-using-guestaccount",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "launch the opencart website using property file",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "mouseover on  Laptops and Notebooks and click on Show all laptops and Notebooks",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "select hp laptop and click add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click Item basket button and click checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Select GuestCheck out option and enter all the mandatory feilds",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click terms and condition and place the order",
  "keyword": "And "
});
formatter.match({
  "location": "TC_06_OrderPlacingWithGuestCheckOut.launch_the_opencart_website_using_property_file()"
});
formatter.result({
  "duration": 7349620500,
  "status": "passed"
});
formatter.match({
  "location": "TC_06_OrderPlacingWithGuestCheckOut.mouseover_on_Laptops_and_Notebooks_and_click_on_Show_all_laptops_and_Notebooks()"
});
formatter.result({
  "duration": 1899986900,
  "status": "passed"
});
formatter.match({
  "location": "TC_06_OrderPlacingWithGuestCheckOut.select_hp_laptop_and_click_add_to_cart()"
});
formatter.result({
  "duration": 2517682400,
  "status": "passed"
});
formatter.match({
  "location": "TC_06_OrderPlacingWithGuestCheckOut.click_Item_basket_button_and_click_checkout_button()"
});
formatter.result({
  "duration": 3580980500,
  "status": "passed"
});
formatter.match({
  "location": "TC_06_OrderPlacingWithGuestCheckOut.select_GuestCheck_out_option_and_enter_all_the_mandatory_feilds()"
});
formatter.result({
  "duration": 7270806100,
  "status": "passed"
});
formatter.match({
  "location": "TC_06_OrderPlacingWithGuestCheckOut.click_terms_and_condition_and_place_the_order()"
});
formatter.result({
  "duration": 27512947700,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#button\\-confirm\"}\n  (Session info: chrome\u003d91.0.4472.164)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027SYEDKHALEEL\u0027, ip: \u0027192.168.119.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.164, chrome: {chromedriverVersion: 91.0.4472.19 (1bf021f248676..., userDataDir: C:\\Users\\KHALEE~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:52667}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: f3835d2e86605e7e942a4594c3aec84c\n*** Element info: {Using\u003did, value\u003dbutton-confirm}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:365)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat com.opencart.pageobject.TC_06_VerifyingOrderPlacementWithGuestCheckOut.confirm(TC_06_VerifyingOrderPlacementWithGuestCheckOut.java:138)\r\n\tat com.opencart.stepdefinitions.TC_06_OrderPlacingWithGuestCheckOut.click_terms_and_condition_and_place_the_order(TC_06_OrderPlacingWithGuestCheckOut.java:53)\r\n\tat ✽.And click terms and condition and place the order(TC_06_OrderPlacementGuestCheckout.feature:10)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 394472400,
  "status": "passed"
});
