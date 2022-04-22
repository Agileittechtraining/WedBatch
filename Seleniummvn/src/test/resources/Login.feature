#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@FID1
Feature: Login of PHP Travels
  I want to use this template for Logging into PHP Travels Page

  @RID1
  Scenario: Login 
    Given To open URL of the application
    And Url is successfully openend 
    When I enter username 
    And I enter password
    And I click on the login button
    Then I validate login page is succefully openened
    