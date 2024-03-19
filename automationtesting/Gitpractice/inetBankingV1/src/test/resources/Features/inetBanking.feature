Feature: Internet Banking project functionality

Scenario: Verify log in section
Given browser is open and url "http://www.demo.guru99.com/V4/" is entered
When enter valid userid "mngr546067"
And enter valid password "zygUpyn"
And click on login button
Then verify that we are navigated to homepage
And close browser

Scenario Outline: Verify log in section with DDT
Given browser is open and url "<url>" is entered
When enter valid userid "<userid>"
And enter valid password "<password>"
And click on login button
Then verify that we are navigated to homepage
And close browser

Examples:
     | userid | password |
     | mngr546067 | zygUpyn |
     | mngr546555 | zygUpyn |