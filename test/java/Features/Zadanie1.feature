Feature: Log in to the created user

  Scenario Outline: add a new address
    Given user has created an account at "https://mystore-testlab.coderslab.pl" website
    When user click Sign in button
    And user fill in an email, password field and click Sign in button
    Then user click on Addresses
    And user click on Create new address
    And user fill in "<alias>", "<address>", "<city>", "<postal_code>", "<country>", "<phone>" and click save button
    Then lastAddress line 0 equals "<alias>"
    Then lastAddress line 2 equals "<address>"
    Then lastAddress line 3 equals "<city>"
    Then lastAddress line 4 equals "<postal_code>"
    Then lastAddress line 5 equals "<country>"
    Then lastAddress line 6 equals "<phone>"
    And Browser is closed



    Examples:
    | alias | address | city | postal_code | country | phone |
    | Mrs.  | Cybisa | Krakow | 02-017 | United Kingdom  | 693 693 693 |


