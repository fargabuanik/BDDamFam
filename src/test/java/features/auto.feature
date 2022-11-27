@auto
Feature: Auto Quote valisation

  Scenario: Auto Qutote test
    Given user navigate to homePage
    When user click start new quote
    And user input zipcode
    And user click car insurance option
    And user click lets go button
    And select city and state
    And user click on continue button
    And continue overlay handled
    Then title of the page will be <auto quote page>
    When user input address
    Then user able to click start new quote button

  @steps
  Scenario: Auto qutote page steps
    When homepage steps done
    And get A Quote page steps done <"85142">
    And Verify your city steps done
    Then about you page steps done

  @data-driven
  Scenario Outline: Data Driven approach for BDD
    When homepage steps done
    And get A Quote page steps done <zipCode>
    And Verify your city steps done
    Then about you page steps done

    Examples: 
      | zipCode |
      | '85140' |
      | '85143' |
