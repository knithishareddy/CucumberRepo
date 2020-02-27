Feature:Login

Scenario Outline: Login successful
    Given user access to URL
    When user enters "<username>" and "<password>" 
    Then login successful

    Examples: 
      | username|password   |
      | Lalitha |password123| 
     

