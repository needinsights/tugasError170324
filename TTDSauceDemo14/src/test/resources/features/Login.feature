@Login
  Feature: Login
    Description here

    Scenario: Login with valid credential
      Given User open the app sauce demo
      When User input "standard_user" as userName and "secret_sauce" as password
      Then User already on dashboard page


    @TC2
    Scenario Outline: Login with invalid credential
      Given User open the app sauce demo
      When User input "<userName>" as userName and "<password>" as password
      Then User see "<errorMessage>" as error text
      Examples:
        | userName      | password     | errorMessage                                                              |
        |               | secret_sauce | Epic sadface: Username is required                                        |
        | standard_user |              | Epic sadface: Username is required                                        |
        |               |              | Epic sadface: Username is required                                        |
        | lekJodi       | paten        | Epic sadface: Username and password do not match any user in this service |
