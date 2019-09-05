@runalltestcases
Feature: Automation Practice Tests

  Background:
    Given I am on automation practice site

  @TC001
  Scenario: Send a message using contact us form

    And I navigate to contact us form
    When I enter details and hit submit
    Then I confirmation that the message has been delivered to customer service team

  @TC002
  Scenario Outline: Create an account using already registered email

    And I click sign in on homepage
    When I try and register with an already registered "<email>"
    Then I should an error message
    Examples:
      | email         |
      | test@test.com |

  @TC003
  Scenario Outline: Add and remove a product
    And I search for "<product>"
    And I add it to cart
    When I click remove from cart
    Then the product should be removed

    Examples:
      | product |
      | T-Shirts |

