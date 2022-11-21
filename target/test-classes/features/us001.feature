Feature: US001 Kayıt olmak için SSN, First Name ve Last Name bilgileri girilebilmelidir.


  Background: ortak adimlar
    Given Belirtilen Url ye gidilir.
    When User ikonuna tıklanır
    And Register butonuna tıklanır

  @Test1
  Scenario Outline: TC_001 Geçerli bir SSN, 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. (Pozitif Test)
    And SSN kutusuna ucuncu ve besinci karakterden sonra (-) iceren dokuz rakamlı bir "<SSN>" girilir
    And 2 saniye bekler
    Then Your SSN is invalid yazısının gorunmedigini doğrular
    Examples:
      | SSN |
      |111-11-1111|
      |222-22-2222|
      |333-33-3333|
      |444-44-4444|
      |555-55-5555|
      |666-66-6666|
      |777-77-7777|
      |888-88-8888|
      |999-99-9999|
      |000-00-0000|
   @Test2
  Scenario Outline: TC002 -SSN kutusuna sadece bir karakteri harf olan 9 rakamlı bir SSN girilir(negatif Test)
    And Gecersiz bir "<SSN>" girilir
     Then "Your SSN is invalid" yazisinin gorundugunu dogrular
    Examples:
      |SSN|
      |a11-11-1111|
      |1a1-11-1111|
      |11a-11-1111|
      |111-a1-1111|
      |111-1a-1111|
      |111-11-a111|
      |111-11-1a11|
      |111-11-11a1|
      |111-11-111a|
  @Test3
  Scenario Outline: TC_003 SSN kutusuna 3. veya 5. karakterden sonra (-) icermeyen 9 rakamlı bir SSN girilir(negatif Test)
   And Gecersiz bir "<SSN>" girilir
   Then "Your SSN is invalid" yazisinin gorundugunu dogrular
   Examples:
     | SSN |
     | 1-1111-1111 |
     | 11-111-1111 |
     | 111-111-111 |
     | 1111-111-11 |
     | 111111-111- |
     | 1111111-1-1 |
     | 1111111111- |
     | 1111-11-111 |
  @Test4
  Scenario Outline: TC_004 SSN kutusuna 3. ve 5. karakterden sonra (-) iceren 8 ve 11 rakamlı bir SSN girilir.(negatif Test)
    And Gecersiz bir "<SSN>" girilir
    Then "Your SSN is invalid" yazisinin gorundugunu dogrular
    Examples:
      | SSN |
      | 111-11-111 |
      | 111-11-11111 |

  @Test5
  Scenario Outline: TC_005, TC_006 SSN kutusuna 3. ve 5. karakterden sonra (-)'den farklı özel karakterli 9 rakamlı bir SSN girilir (negatif Test)
    And Gecersiz bir "<SSN>" girilir
    Then "Your SSN is invalid" yazisinin gorundugunu dogrular
    Examples:
      | SSN |
      | 111*11*1111 |
      | 111+11+1111 |
      | 111/11/1111 |
      | 111.11.1111 |
      | 111,11,1111 |
      | 111 11 1111 |
      | 111#11#1111 |
      | 111$11$1111 |
      | 111;11;1111 |
      | 111=11=1111 |

    @Test7
  Scenario: TC_007 SSN boş birakilamaz. (negatif Test)
    And SSN box a tiklanir ve hic birsey  girilmez
    Then "Your SSN is required." yazisinin gorundugunu dogrular

   @Test8
  Scenario Outline: TC_008 Herhangi bir karakter iceren ve bos birakilamayan gecerli bir "First Name" olmalidir.(pozitif Test)
    And firstname boxa gecerli "<firstname>" girilir
     Then gecerli bir firstName girilebildigini dogrulanir
    Examples:
      | firstname |
      | / |
      | - |
      | + |
      | * |
      | ; |
      | , |
      | . |
      | : |
      | = |
      | / |
      | $ |
      | % |
      | 1 |
      | a |
      | ' |
    @Test9
    Scenario: TC_009 Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir "First Name" olmalıdır.(negatif Test)
      And firstname boxa tiklanir ve hic birsey girilmez
      Then "Your FirstName is required." feedback yazisinin gorundugunu dogrular
  @Test10
  Scenario Outline: TC_008 Herhangi bir karakter iceren ve bos birakilamayan gecerli bir "Last Name" olmalidir.(pozitif Test)
    And lastName boxa gecerli "<lastname>" girilir
    Then gecerli bir lastName girilebildigini dogrulanir
    Examples:
      | lastname |
      | / |
      | - |
      | + |
      | * |
      | ; |
      | , |
      | . |
      | : |
      | = |
      | / |
      | $ |
      | % |
      | 1 |
      | a |
      | ' |
  @Test11
  Scenario: TC_009 Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir "Last Name" olmalıdır.(negatif Test)
    And lastName boxa tiklanir ve hic birsey girilmez
    Then "Your FirstName is required." lastname feedback yazisinin gorundugunu dogrular

