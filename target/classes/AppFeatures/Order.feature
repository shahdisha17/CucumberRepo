Feature: Amazon Order Page
 
Background:
 Given a registered user exists
 Given user is on Amazon login page
 When user enters username
 And user enters password
 And user click on login button
 Then user navigates to the order page
 
 @Smoke
Scenario: Check Previous Order Details
 When user click on order link
 Then user checks the previous order details
@Smoke
Scenario: Check Open Order Details
 When user click on open order link
 Then user checks the open order details
@Smoke
Scenario: Check Previous Cancelled Order Details
 When  user clicks on cancelled order link
 Then user checks the cancelled order details