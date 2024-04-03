Feature:Flight from istanbul to ankara

  Background:
    Given user goes to enuygun.com webpage
    When user search for a round trip departure on "25" "Eylül 2024"  and return on "10" "Aralık 2024"  from "istanbul" to "ankara" for "5" adult
    And user clicks on search and filter departure flights between 10.0 and 18.0

  @case1 @smoke
  Scenario: Verify main page tabs
    Then user validates the result are between 10.0 and 18.0

  @case2
  Scenario: Verify whether the order of Turkish Airlines flight prices increasing
    Then user clicks on the THY company and validate the order