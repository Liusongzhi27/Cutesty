Feature: AddProductToCart test

  //Perform the login operation in www.saucedemo.com, add 1st product to the shopping cart, and click on the cart.

  Scenario Outline: Login function of the website.
    Given user login to saucedemo
    When I enter Username as "<username>" and Password as "<password>"
    Then log in unsuccessful
    Examples:
      | username      | password     |
      |               |              |
      | 1             | 1            |
      | problem_user    | secret_sauce |
      | standard_user | secret_sauce |
      | performance_glitch_user | secret_sauce |

  Scenario:Add First items to the shopping cart
    Given User Select Items
    When  User Click Add To Cart
    Then  After adding to the cart and the cart will be opened afterwards.