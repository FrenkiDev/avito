@F
Feature: Поиск в яндекс

  Scenario: Поиск через поисковую строку
    Given Запустить браузер "https://www.google.ru/"
    When Ввести в поле значение "БОШ ОМ"
    And Нажать на кнопу "Поиск"
    Then Ожидаемое "https://www.google.ru/search?" полученное
