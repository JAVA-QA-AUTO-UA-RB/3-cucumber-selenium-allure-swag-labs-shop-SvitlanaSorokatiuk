package org.example.steps;

import io.cucumber.java.en.*;
import org.example.helpers.SingletonBrowserProvider;
import org.example.pages.LoginPage;
import org.example.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SwagLabsLoginSteps {

    private WebDriver driver;

    // Це приклад файлу з визначенням степів, вам треба буде допис  ати кроки сюди, а також, якщо потрібно,
    // Створити подібні файли для інших сценаріїв
    // Загальна структура проєкту залишається на ваш розсуд, проте бажано, щоб вона була чистою і логічною

    // Перед початком роботи видаліть степдефінішни, які не є релевантними вашому проєкту, щоб вони не плуталися під ногами

    @Given("the web browser window is opened")
    public void theWebBrowserWindowIsOpened() {
        driver = SingletonBrowserProvider.getDriver();
    }

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("the user enters the username {string}")
    public void theUserEntersTheCorrectUsername(String username) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillUsernameField(username);
    }

    @And("the user enters the password {string}")
    public void theUserEntersTheCorrectPassword(String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillPasswordField(password);
    }

    @And("the user presses the login button")
    public void theUserPressesTheLoginButton() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.pressLoginButton();
    }

    @Then("the page with products is displayed")
    public void thePageWithProductsIsDisplayed() {
        ProductsPage productsPage = new ProductsPage(driver);
        boolean isProductsPageDisplayed = productsPage.isProductsPageDisplayed();
        Assert.assertTrue(isProductsPageDisplayed);
    }

    @But("login page is not displayed")
    public void loginPageIsNotDisplayed() {
        LoginPage loginPage = new LoginPage(driver);
        boolean isLoginPageDisplayed = loginPage.isLoginPageDisplayed();
        Assert.assertFalse(isLoginPageDisplayed);
        }

    @Then("an error message is displayed")
    public void anErrorMessageIsDisplayed() {
        LoginPage loginPage = new LoginPage(driver);
        boolean isErrorMessageDisplayed = loginPage.checkErrorMessage();
        Assert.assertTrue(isErrorMessageDisplayed);
    }

    @And("the login page is displayed")
    public void theLoginFormContinuesToDisplay() {
        LoginPage loginPage = new LoginPage(driver);
        boolean isLoginPageDisplayed = loginPage.isLoginPageDisplayed();
        Assert.assertTrue(isLoginPageDisplayed);
    }

    @But("the page with products is not displayed")
    public void thePageWithProductsIsNotDisplayed() {
        ProductsPage productsPage = new ProductsPage(driver);
        boolean isProductsPageDisplayed = productsPage.isProductsPageDisplayed();
        Assert.assertFalse(isProductsPageDisplayed);
    }

    @And("the user moved to the page with products with correct username {string} and password {string}")
    public void theUserMovedToThePageWithProductsWithCorrectUsernameAndPassword(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillUsernameField(username);
        loginPage.fillPasswordField(password);
        loginPage.pressLoginButton();
    }

    @When("the user clicks on the burger menu button")
    public void theUserClicksOnTheBurgerMenuButton() {
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.goToBurgerMenu();
    }

    @And("the user clicks logout button")
    public void theUserClicksLogoutButton() {
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.logoutFromTheSite();
    }

     }