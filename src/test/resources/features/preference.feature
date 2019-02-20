Feature:Preferences functionality
  As a user/manager, when I enter correct login information,
  I should be able to see Preferences Changes

  Scenario: Manager/User should be able verify Change Preferences functionality
    Given manager is on home page
    When manager clicks on Manufacturing module
    Then manager clicks on Preferences functionality


  Scenario: Manager/User should be able verify TimeZone functionality
      Given manager is on home page
      When manager clicks on Manufacturing module
      Then manager clicks on Preferences functionality and Verify TimeZone

  Scenario: Manager/User should be able verify Language functionality
    Given manager is on home page
    When manager clicks on Manufacturing module
    Then manger clicks on Preferences functionality and verify Language functionality


  Scenario: Manager/User should be able verify Notification Management functionality
    Given manager is on home page
    When manager clicks on Manufacturing module
    Then manger clicks on Preferences functionality
    And verify Notification Management functionality


  Scenario: Manager/User should be able verify  Signature functionality
    Given manager is on home page
    When manager clicks on Manufacturing module
    Then manger clicks on Preferences functionality
    And verify  Signature functionality


  Scenario: Manager/User should be able verify "Forum Karma" functionality
    Given manager is on home page
    When manager clicks on Manufacturing module
    Then manger clicks on Preferences functionality
    And verify Forum Karma functionality

  Scenario: Manager/User should be able verify "Change password" functionality
    Given manager is on home page
    When manager clicks on Manufacturing module
    Then manger clicks on Preferences functionality
    And verify Change password functionality


  Scenario: Manager/User should be able verify  Cancel button
    Given manager is on home page
    When manager clicks on Manufacturing module
    Then manger clicks on Preferences functionality
    And verify  Cancel button and clickable


  Scenario: Manager/User should be able verify  Save button
    Given manager is on home page
    When manager clicks on Manufacturing module
    Then manger clicks on Preferences functionality
    And verifying Save button and clickable

  @wip
  Scenario: Manager/User should be able verify  Main Cancel button
    Given manager is on home page
    When manager clicks on Manufacturing module
    Then manger clicks on Preferences functionality
    And verifying cancel button and clickable


















