Feature: Search for Words
Scenario Outline: User found the words they were search for

Given User open the mobile app
When User taps on Search button in the home page
And User inputs <searchText> in search box
Then Search based on input <searchText> yield a result

Examples:
|searchText|
|Test|
|Checklist|