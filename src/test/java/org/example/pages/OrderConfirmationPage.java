package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderConfirmationPage {

    private WebDriver driver;

    public OrderConfirmationPage (WebDriver driver) {
        this.driver = driver;
    }

    public static final By completeCheckoutTitle = By.cssSelector("span[data-test=\"title\"");
    public static final By completeHeaderInformation = By.cssSelector("h2[data-test=\"complete-header\"");
    public static final By completeTextInformation = By.cssSelector("div[data-test=\"complete-text\"");
    public static final By backHomeButton = By.id("back-to-products");

}
