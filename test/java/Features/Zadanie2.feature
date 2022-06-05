Feature: Adding to the cart and payment

  Scenario: user owns an account and wants to buy a Hummingbird Printed Sweater

    Given user has an account at "https://mystore-testlab.coderslab.pl" website
    When user clicks on Sign in button
    And user fills in an email, password field and click Sign in button
    And chooses clothes tab
    Then  chooses HUMMINGBIRD PRINTED SWEATER
    And checks if twenty % discount is added
    And marks size M, quantity  five adds them to the cart
    And user click proceed button
    And clicks proceed button at shopping cart level
    And marks correct address and clicks continue button, shipping method Pick up in-store
    And chooses payment: pay by check, terms of service click order button and take a screenshot of order
    And checks history of order
    And checks if order has Awaiting check payment status and checks correctness of payment
    And close browser









