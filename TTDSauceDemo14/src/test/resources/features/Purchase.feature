@Purchase
Feature: Purchase
  Description here

  Scenario: Pick one item from inventory
    Given User open the app sauce demo
    When User input "standard_user" as userName and "secret_sauce" as password
    Then User already on dashboard page
    When user sort product by "Price (low to high)"
    And User click add to cart item "Sauce Labs Backpack"
    And User click add to cart item "Sauce Labs Bike Light"
