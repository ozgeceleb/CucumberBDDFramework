Feature: Ilk_urun_arama

  Scenario: Google_urun_arama
    Given Kullanici google a gider
    When togg için arama yapar
    Then sonuclara togg oldugunu dogrular
    And tarayıcıyı kapat

