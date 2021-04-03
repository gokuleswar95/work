Feature: Booking a flight in Goibibo application

Scenario: User enters username
    Given User launch the applicationn
    When User enter "8056430533" as username
    Then User validates the username
    
Scenario: User enters password
    Given User enters "gokuleswar1995" as password
    Then User validates the password