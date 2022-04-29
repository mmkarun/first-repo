Feature: validating login fields

 Scenario: login with valid userName and invalid password
        Given user is facebook page
        When user enter userName and password
        And user click login button
       Then user should verify homePage 
