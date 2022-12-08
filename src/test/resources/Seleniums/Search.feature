Feature: Search

  Scenario Outline: Login function of the website.
    Given user Search
    When user Search title is "<title>"
    Then Search be successful
    Examples:
      | title |
      | java  |
      | 123   |
      | FENTA |
      | RooM123_ |
      | c#    |