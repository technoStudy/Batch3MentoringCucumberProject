Feature: Login Page Functionalities

  Scenario Outline: Login to the user account with valid or invalid credentials
    Given Open Campus "homepage"
    And Enter "<username>" and "<password>"
    When Click on login button
    Then Verify login <status>

    Examples:
      | username             | password        | status |
      | daulet               | TechnoStudy123@ | fails  |
      | daulet2030@gmail.com | Techno          | fails  |
      | daulet2              | Techno          | fails  |
      | daulet2030@gmail.com | TechnoStudy123@ | passes |