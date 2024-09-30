package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPageOne {

    private WebDriver driver;

    public CheckoutPageOne (WebDriver driver) {
        this.driver = driver;
    }

    public static final By firstNameField = By.id("first-name");
    public static final By lastNameField = By.id("last-name");
    public static final By postalCodeField = By.id("postal-code");
    public static final By continueButton = By.id("continue");
    public static final By cancelButton = By.id("cancel");

    public void fillFirstNameField(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void fillLastNameField(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void fillpostalCodeField(String postalCode) {
        driver.findElement(postalCodeField).sendKeys(postalCode);
    }

    public void placingAnOrder() {
        driver.findElement(continueButton).click();
    }

    public void returnToTheShoppingCart() {
        driver.findElement(cancelButton).click();
    }
}
