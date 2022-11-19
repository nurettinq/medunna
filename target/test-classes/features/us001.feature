Feature: US001 Kayıt olmak için SSN, First Name ve Last Name bilgileri girilebilmelidir.


  Background: ortak adimlar
    Given Belirtilen Url ye gidilir.
    When User ikonuna tıklanır
    And Register butonuna tıklanır

  @tes
  Scenario Outline: TC001 Geçerli bir SSN, 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır. (Pozitif Test)
    And SSN kutusuna ucuncu ve besinci karakterden sonra (-) iceren dokuz rakamlı bir "<SSN>" girilir
  Then Your SSN is invalid yazısının görünmediğini doğrular
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
  Scenario Outline: TC002, SSN kutusuna sadece bir karakteri harf olan 9 rakamlı bir SSN girilir(negatif Test)
    And Gecersiz bir "<SSN>" girilir
    Then Your SSN is invalid yazisinin gorundugunu dogrular
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
 Scenario Outline: TC003, SSN kutusuna 3. veya 5. karakterden sonra (-) icermeyen 9 rakamlı bir SSN girilir(negatif Test)
   And Gecersiz bir "<SSN>" girilir
   Then Your SSN is invalid yazisinin gorundugunu dogrular
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
  Scenario Outline: TC004,TC005 SSN kutusuna 3. ve 5. karakterden sonra (-) iceren 8 ve 11 rakamlı bir SSN girilir.(negatif Test)
    And Gecersiz bir "<SSN>" girilir
    Then Your SSN is invalid yazisinin gorundugunu dogrular
    Examples:
      | SSN |
      | 111-11-111 |
      | 111-11-11111 |
  Scenario Outline: TC004,SSN kutusuna 3. ve 5. karakterden sonra (-)'den farklı özel karakterli 9 rakamlı bir SSN girilir (negatif Test)
    And Gecersiz bir "<SSN>" girilir
    Then Your SSN is invalid yazisinin gorundugunu dogrular
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

    @Test3
  Scenario: TC004,SSN boş bırakılamaz. (negatif Test)
    And SSN box a tiklanir ve hic birsey  girilmez
    Then "Your SSN is required." yazisinin gorundugunu dogrular


