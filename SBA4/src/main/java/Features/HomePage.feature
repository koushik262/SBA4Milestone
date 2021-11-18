Feature: Bounty Essentials Testing
Scenario: outline
Given Initialize browser with chrome
And Navigate to "https://bountytowels.com/en-us" site
Then click on Search and enter "paper"
And check weather thepagecontains "RESULTS FOR 'PAPER'"
And Close the driver
