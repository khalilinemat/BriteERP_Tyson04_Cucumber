Feature: Testing with a random user


  Scenario: Positive Random Test

    Given user is on the login page
    When user on the logs in using "mstacey8r@imdb.com" and "skylargiblin"
    Then user should be "dark-side"

  @practice
  Scenario Outline: All sides

    Given user is on the login page
    When user on the logs in using "<email>" and "<password>"
    Then user should be "<side>"

    Examples: looking for all sides like below:

      | email              | password | side      |
      | mstacey8r@imdb.com | password | dark-side |
      | mstacey8r@imdb.com | password | dark-side |
      | mstacey8r@imdb.com | password | dark-side |
