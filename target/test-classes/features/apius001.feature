Feature: US_002 Kayit olmak icin email and username bilgileri girilebilmelidir.

  Background: Ortak Adimlar
    Given   YE User Medunna
    When    YE User send Get request
    Then    YE Status code is 200

  Scenario: TC_002 Kullanici adi api kullanilarak dogrulanmalidir.

    And   YE Verifies that valid username is also api


  Scenario: TC_004 E-mail API ve DB ile doğrulanmalıdır.

    And   YE Verifies that valid email is also api
