Feature: Login to HRM Application 
  
  @ValidCredentials
  Scenario: Login with valid credentials
 
    Given User is on HRMLogin page
    When User enters valid credentials
      | Admin | admin123 |
    Then User should be able to login successfully and new page open
    
 @InValidCredential
Scenario: Login with invalid credential
 
  Given User is on HRMLogin page
  When User enters invalid credentials and Login will be unsuccessful with error message
    | Username  | Password   |
    | Admin1    | admin123!$ |
    
 @InValidCredentials
Scenario: Login with invalid credentials
 
  Given User is on HRMLogin page
  When User enters invalid credentials and Login will be unsuccessful with custom error messages
    | Username    | Password  | ErrorMessage         |
    | Admin1      | admin123! | Invalid credentials  |
    | Admina      | admin123a | Invalid credentials  |