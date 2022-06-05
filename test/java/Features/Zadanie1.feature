Feature: Log in to the created user

  Scenario Outline: add a new address
    Given user has created an account at "https://mystore-testlab.coderslab.pl" website
    When user click Sign in button
    And user fill in an email, password field and click Sign in button
    Then user click on Addresses
    And user click on Create new address
    And user fill in "<alias>", "<address>", "<city>", "<postal_code>", "<country>", "<phone>" and click save button
    And user check if all data is correct
    And Browser is closed



    Examples:
    | alias | address | city | postal_code | country | phone |
    | Mrs.  | Cybisa | Krakow | 02-017 | United Kingdom  | 693 693 693 |


