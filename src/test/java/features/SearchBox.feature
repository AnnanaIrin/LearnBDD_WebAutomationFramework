Feature: SearchBox Functionality


#  Test Scenario/Scenario:
#  Test case Design/Scenario design Step by step
  Background:
    Given user is landed on costco homepage



  Scenario:Costco search box Functionality Should work with a valid product name.
    And  user enter valid product name
    When user click on search button
    Then user should see the valid product appears


  Scenario:   Costco search box Functionality Should not work with any invalid product name.
    And  user is enter Invalid product name
    When user click on search button
    Then user should see the partial matched valid product appears
    But user should not see the Invalid product appears


#    Scenario:  Costco search box should be middle of the header.









