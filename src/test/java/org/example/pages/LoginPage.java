package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.NoSuchElementException;

public class LoginPage {

    private WebDriver driver;

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    // Authorization form
    public static final By usernameField = By.cssSelector("input[placeholder='Username']");
    public static final By passwordField = By.cssSelector("input[placeholder='Password']");
    public static final By loginButton = By.id("login-button");
    public static final By errorMessage = By.cssSelector("h3[data-test=\"error\"]");

    public boolean isLoginPageDisplayed() {
        try {
            WebElement loginPageDisplayed = driver.findElement(usernameField);
            return loginPageDisplayed.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    // Authorization in the system
    public void fillUsernameField (String name) {
        driver.findElement(usernameField).sendKeys(name);
    }

    public void fillPasswordField (String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void pressLoginButton () {
        driver.findElement(loginButton).click();
    }

    public boolean checkErrorMessage () {
        try {
            WebElement errorMessageActual = driver.findElement(errorMessage);
            return errorMessageActual.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
