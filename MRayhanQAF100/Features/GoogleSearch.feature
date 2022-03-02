Feature: Google search

Scenario Outline: Perform a simple search

Given I am on google homepage
When i enter a search "<keyword>" on the search box
And I click on the results and count of the results
Then I find relevent results and count of the results



Examples:
|keyword                         |
|Quality Assurance               |
|Test Automation                 |