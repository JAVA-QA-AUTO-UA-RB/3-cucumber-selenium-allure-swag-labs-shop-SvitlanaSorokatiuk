package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {

    private WebDriver driver;

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    // Authorization form
    public static final By usernameField = By.cssSelector("input[placeholder='Username']");
    public static final By passwordField = By.cssSelector("input[placeholder='Password']");
    public static final By loginButton = By.id("login-button");

    public void isLoginPageDisplayed() {
        boolean isLoginPageDisplayed = driver.findElements(By.id("user-name")).size() > 0;
        Assert.assertFalse(isLoginPageDisplayed);
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

}
