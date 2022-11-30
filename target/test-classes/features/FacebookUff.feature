Feature: verify the login functionality

  Background: 
    Given Launch the chrome browser and maximize the browser

  Scenario Outline: verify the positive and negative test cases in login field
    When Launch the facebook url in chrome browser
    And To pass the positive and negative username "<emailids>" in email field
    And To pass the positive and negative passwords "<passwords>" in password field
    Then close the browser

    Examples: 
      | emailids      | passwords |
      | abc@gmail.com |   2345678 |
      | def@gmail.com |   8765432 |
      | ghi@gmail.com |   0987654 |
      | jkl@gmil.com  |   5676543 |
