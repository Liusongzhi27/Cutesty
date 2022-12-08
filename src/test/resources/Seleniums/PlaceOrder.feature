Feature: PlaceOrders test

  Scenario Outline: Login function of the website.
    Given user login to saucedemo
    When I enter Username as "<username>" and Password as "<password>"
    Then log in unsuccessful
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |


  Scenario Outline:User CheckOut
    Given user open Shopping Card And click CHECKOUT
    When  FirstName as "<FirstName>" and LastName as "<LastName>" and Zip/PostalCode as "<Zip/PostalCode>"
    Then Whether the payment was successful
    Examples:
      | FirstName | LastName | Zip/PostalCode |
      | Jason     | Statham  | 4025           |
      | Medium    |  Large   | 123456789      |
      | Liu       | Songzhi  | 4032           |

