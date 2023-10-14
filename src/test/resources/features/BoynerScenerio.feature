@boyner

Feature: Negatif Uyelik

  Scenario Outline: Negatif Uyelik
    Given Go to Boyner website
    When Go to the login button
    And  Click the login button
    Then  Verified that is the  membership page
    And entered the "<name>" at membership page in the name section
    Then entered the  email bolumune "<email>" at membership pagee in the email section
    Then enteredd the  "<password>" at membership page in the password section
    Then entered the "<cellphone>"  at membership page in the cellphone section
    Then entered the  "<membership text>" at membership page in the membership text section
    Then entered the  "<consent text>" at membership page in the consent text section
    And Click the sign up button
    Then Assert that the don't membership


    Examples:
      | name   | email         | password | cellphone | membership text | consent text |
      | Ozge   | celebii@gmail | 1233     | 1214154   | 1               | 1            |
      | Murat  | murat@jhwfjh  | 4515452  | 54534     | 1               | 1            |
      | Cicek  | murat@jhwfjh  | 4515452  | 54534     | 1               | 1            |
      | Joseph | murat@jhwfjh  | 4515452  | 54534     | 1               | 1            |