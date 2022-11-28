Feature: database test

   @dbas
  Scenario: TC_005 E-mail API ve DB ile doğrulanmalıdır.
    Given nq Connect to database
    When nq According to the SSN value in the table, the user receives all information
    Then nq Verify  query result
