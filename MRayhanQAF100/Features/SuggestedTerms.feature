Feature: google search for suggested terms

Scenario Outline: Suggested terms google search

Given I am on the google homepage
When  I enter search "<keyword>"
And   I select the first suggested search item
Then  I see relevent search results
When  I click on the first search result link
Then  I land on the site result page

Examples: 
|keywod                 |
|Quality Assurance      |
|Software Testing       |