package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPageTwo {

    private WebDriver driver;

    public CheckoutPageTwo (WebDriver driver) {
        this.driver = driver;
    }

    public static final By paymentInformation = By.cssSelector("div[data-test=\"payment-info-label\"]");
    public static final By shippingInformation = By.cssSelector("div[data-test=\"shipping-info-label\"]");
    public static final By priceTotalInformation = By.cssSelector("div[data-test=\"total-info-label\"]");
    public static final By finishButton = By.id("finish");
    public static final By cancelCheckoutButton = By.id("cancel");

}
