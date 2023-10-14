@cicekSepeti

Feature: Data Table TEST
  Scenario: Cicek sepeti urun renk secme
    Given "cicek sepeti" adresine gidilir
    When dogum gunu butonu tiklanir
    Then dogum gunu sayfasinda oldugu dogrulanir
    When renk drop down tiklanir
    Then sirasiyla renklerin secildiği dogrulanir

      | renkler    |
      | bej        |
      | beyaz      |
      | cok renkli |
      | gri        |
      | kahverengi |