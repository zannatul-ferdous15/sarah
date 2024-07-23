
Feature: Home page header link verification
Scenario: verify all header link 

Given open SoftwareTest "<URL>" application
When verify home, contact, about us, log in, sign up, cart all link are on the home page

Scenario: verify home link 
Given open SoftwareTest "<URL>" application
Then verify home link is clikable 

Scenario: verify contact link 
Given open SoftwareTest "<URL>" application
And verify contact link is clikable 

Scenario: verify about us link
Given open SoftwareTest "<URL>" application
And verify about us link is clikable  



