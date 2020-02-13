Feature: Summer Dresses

  @demo
  Scenario: Validate Summer dresses
    Given Automation practice application is opened
    When I click dresses
    And I click summer dresses
    And I click quick view for "Printed Summer Dress"
    And I click the color "Blue"
    And I add to cart
    Then validate the following product name on chart summary page "Printed Summer Dress"
    And validate the following color on chart summary page "Blue"
    And validate the following quantity on chart summary page "1"
