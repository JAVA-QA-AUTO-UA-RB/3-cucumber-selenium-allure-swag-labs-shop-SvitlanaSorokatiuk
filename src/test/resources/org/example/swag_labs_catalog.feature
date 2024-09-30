# Додайте сюди сценарії, які перевіряють сторінку зі списком товарів, а також сторінку з деталями товару
# Подумайте, які з них ви покрили б в першу чергу, що важливо користувачу інтенет-магазину? Що важливо власнику інтернет-магазину?

Feature: Swag Labs Shopping Cart

  Background:
    Given the web browser window is opened
    And the user is on the login page
    And the user moved to the page with products with correct username "standard_user" and password "secret_sauce"

  Scenario: Add one product to the shopping cart
    When the user adds product "Sauce Labs Backpack" to the shopping cart
    And the user goes to the product cart
    Then the added product "Sauce Labs Backpack" is displayed in the shopping cart page

