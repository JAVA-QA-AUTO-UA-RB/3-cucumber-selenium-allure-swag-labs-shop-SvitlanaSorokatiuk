package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ProductsPage {

    private WebDriver driver;

    public ProductsPage (WebDriver driver) {
        this.driver = driver;
    }

    // Buttons of the page
    public static final By addToCardButton = By.id("add-to-cart-sauce-labs-backpack");
    public static final By sortButton = By.cssSelector("select[data-test=product-sort-container]");
    public static final By dropdownMenu = By.cssSelector("option[value='za']");
    public static final By shoppingCardLink = By.cssSelector("a[data-test=shopping-cart-link]");

    public boolean isProductsPageDisplayed() {
        WebElement pageTitle = driver.findElement(By.className("title"));
        return pageTitle.getText().equals("Products");
    }

    //
    public void addToCard() {
        driver.findElement(addToCardButton).click();
    }

    public void sortProducts() {
        driver.findElement(sortButton).click();
        driver.findElement(dropdownMenu).click();
    }

    public void goToShoppingCard () {
        driver.findElement(shoppingCardLink).click();
    }
}
