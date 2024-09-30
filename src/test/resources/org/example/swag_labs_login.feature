Feature: Swag Labs User Login

  Background:
    Given the web browser window is opened

    # Перший сценарій дано як приклад
    # Допишіть сюди свої сценарії як відповідають фічі, що зараз тестується (можуть бути як позитивні так і негативні)
    # Приклади сценаріїв: логінізація з існуючим валідним користувачем, логінізація з кредами неіснуючого користувача,
    # логінізація з кредами користувача, який є заблокованим (locked_out_user)
  # Сюди має також увійти сценарії (вилогінювання/виходу/Log out) з сайту, бо ми маємо переконатися що при бажанні користувач може вийти

  Scenario: Log in with correct credentials
    Given the user is on the login page
    When the user enters the username "standard_user"
    And the user enters the password "secret_sauce"
    And the user presses the login button
    Then the page with products is displayed
    But login page is not displayed

  Scenario: Log in with incorrect credentials
    Given the user is on the login page
    When the user enters the username "user123"
    And the user enters the password "123"
    And the user presses the login button
    Then an error message is displayed
    And the login page is displayed
    But the page with products is not displayed

  Scenario: Log out of the site
    Given the user is on the login page
    And the user moved to the page with products with correct username "standard_user" and password "secret_sauce"
    When the user clicks on the burger menu button
    And the user clicks logout button
    Then the page with products is not displayed
    And the login page is displayed





