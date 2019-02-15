@create
Feature: BriteERP Login Test


  Background: manager is on home page

  @login
  Scenario: Verify the empty message on login home page

    Given manager should be able to navigate to the url
    When  manager signs in the home page
    Then  manager should see an empty message "emptyMessage"
    And manager should be able to verify the empty message

  @orders
  Scenario: BriteERP logo and Manufacturing Orders text

    When  manager clicks on Manufacturing module
    Then  manager should be see BriteERP logo at the top left
    And manager should be able to verify Manufacturing Orders text


  @available
  Scenario: Verify the list of available items

    When  manager clicks on Materials Availability
    Then  manager should see a list of Partial Available items
    And manager should be able to verify the list of Partial Available items

  @create
  Scenario: Verify the finish product message

    When  manager clicks on create button
    Then  manager should see a new window page
    And manager clicks on Finished Products link
    And manager should be able to verify the Finish Product Standard Message