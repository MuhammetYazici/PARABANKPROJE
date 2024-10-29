Feature: Login

  Scenario: Login with valid user information
      Given user visits the parabank website.
      And   the user sees the "Customer Login" section on the home page.

       And   Who user logs with the following information:
      | Username | Password |
      | f | f |

    And The user confirms that you successfully login.
    But user switches the session with the log out option.