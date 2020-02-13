Feature: Negative testing for registration

    @demo
    Scenario: Validation for Invalid email
    Given Automation practice application is opened
    When I click sign in
    And I enter invalid email id "test"
    Then I should see the error "Invalid email address."