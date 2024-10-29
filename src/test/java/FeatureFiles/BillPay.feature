Feature: BillPay Functionality

  Background:
    Given Navigate to paraBank website
    And Who user logs with the following information:
      | q        | q        |
    And The user confirms that you successfully login.

  Scenario Outline:
    And Click on the Elements
      |billPay|
    Then Send payment
      | payeName        | <Name>        |
      | payeAddress     | <Address>     |
      | payeCity        | <city>        |
      | payeState       | <state>       |
      | payeZipCode     | <zipCode>     |
      | payePhoneNumber | <phone>       |
      | payeAccount     | <account>     |
      | payeVerAccount  | <veriaccount> |
      | payeAmount      | <amount>      |


    And Click on the Elements
      |payeSend|
    And receive invoice successfully paid message

    And Navigate to Accounts Overview
    And Click the account number

    Examples:
      | Name                 | Address     | city     | state | zipCode | phone  | account | veriaccount | amount |
      | Enerjisa Electricity | enerji apt. | trabzon  | bos   | yok     | 21321  | 1234    | 1234        | 1000   |
      | IGDAS Natural Gas    | gaz apt.    | istanbul | bos   | yok     | 54265  | 1234    | 1234        | 1500   |
      | ISKI Water           | su apt.     | ankara   | bos   | yok     | 453665 | 1234    | 1234        | 500    |