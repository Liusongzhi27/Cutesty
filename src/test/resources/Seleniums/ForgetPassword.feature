Feature: user Forget Password

//Enter the wrong password in the login site, then try to click "forget password",

  Scenario Outline: Login function of the website.
    Given user login to phptravels
    When F Enter Username as "<username>" and Password as "<password>"
    Then log in successful
    Examples:
      | username      | password     |
      | whatever      | passwrong    |
      | whenever      | passerror    |
      | Room          | FENTA1       |
      | 111           | 111          |


  Scenario Outline:  User try to get password with email
    Given user forget password when login
    When user click Forget Password and Email Address is "<email>"
    Then Recover the password should be unsuccessful
    Examples:
      | email |
      |       |
      |123    |
      |1234@gmail.com|
      |user@phptravels.com|
      |admin@phptravels.com|

