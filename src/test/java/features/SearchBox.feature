Feature: SearchBox Functionality


#  Test Scenario/Scenario:
#  Test case Design/Scenario design Step by step
  Background:
    Given user is landed on costco homepage


  @SmokeTest @RegressionTest @pending
  Scenario:Costco search box Functionality Should work with a valid product name.
    And  user enter valid product name
    When user click on search button
    Then user should see the valid product appears

  @RegressionTest @pending
  Scenario:   Costco search box Functionality Should not work with any invalid product name.
    And  user is enter Invalid product name
    When user click on search button
    Then user should see the partial matched valid product appears
    But user should not see the Invalid product appears

  @RegressionTest @pending
  Scenario:Costco search box Functionality Should work with a valid product name.
    And  user enter "Furniture" valid product name
    When user click on search button
    Then user should see "Furniture" the valid product appears

  @RegressionTest @pending
  Scenario:Costco search box Functionality Should work with a valid product name.
    And  user enter "Furniture" valid product name for search
    When user click on search button
    Then user should see "Furniture" the valid product appears after search


  #Scenario outline : To pass multiple set of data in one test case
  @RegressionTest @pending
  Scenario Outline: Costco search box Functionality Should work with a valid product name using Scenario outline
    And  user enter valid "<productName>" products name
    When user click on search button
    Then user should see the valid "<expectedProduct>" products appears
  Examples:
    | productName    | expectedProduct |
    | Beauty         | Beauty          |
    | Computers      | Computers       |
    | dress          | dress           |

  @RegressionTest
  Scenario: SearchBox functionality should work with a valid products name
    And user enter valid product name for search
      | product Name |
      | Furniture         |
    When user click on search button
    Then user should see the valid product appears after search
      | Expected product Name |
      | Furniture                  |


  #Data table
  #Data table help us to pass the data
  @RegressionTest @pending
  Scenario:Costco user should login with valid credential.
    And  user enter valid user name & password
    | user name | password |
    | irin      | Test123  |


    When user click on signIn button
    Then user should see profile name




#    Scenario:  Costco search box should be middle of the header.









