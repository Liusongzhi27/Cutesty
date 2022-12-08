Feature: Scenario Outline

//Performing login operations in www.saucedemo.com

  Scenario Outline: Login function of the website.
    Given user login to saucedemo
    When I enter Username as "<username>" and Password as "<password>"
    Then log in unsuccessful
    Examples:
      | username      | password     |
      | whatever      | passwrong    |
      | whenever      | passerror    |
      | Room          | FENTA1       |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |