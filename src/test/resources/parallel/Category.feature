Feature: Category Test Feature

 Background:
Given user has already logged in to application
|username|password|
|dec2020secondbatch@gmail.com|Selenium@12345|

@category
Scenario: Accounts section count
Given category user is on Accounts page
When verify the category tabs displayed
|WOMEN|
|DRESSES|
|T-SHIRTS|
And accounts section count should be 6
