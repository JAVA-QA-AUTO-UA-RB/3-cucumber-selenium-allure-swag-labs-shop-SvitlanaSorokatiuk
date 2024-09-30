package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

import java.security.PublicKey;
import java.time.Duration;

public class ProductsPage {

    private WebDriver driver;

    public ProductsPage (WebDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Buttons of the page
    public static final By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    public static final By sortButton = By.cssSelector("select[data-test=product-sort-container]");
    public static final By dropdownMenu = By.cssSelector("option[value='za']");
    public static final By shoppingCardLink = By.cssSelector("a[data-test=shopping-cart-link]");
    public static final By productsPageTitle = By.cssSelector("span[data-test=\"title\"]");
    public static final By burgerMenuButton = By.id("react-burger-menu-btn");
    public static final By logoutButton = By.cssSelector("a[data-test=\"logout-sidebar-link\"]");

    public boolean isProductsPageDisplayed() {
        try {
            WebElement productsPageTitleDisplayed = driver.findElement(productsPageTitle);
            return productsPageTitleDisplayed.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void addToCart(String productName) {
        String xpath = "//div[text()='" + productName + "']//following-sibling::button";
        driver.findElement(By.xpath(xpath)).click();
    }


    public void sortProducts() {
        driver.findElement(sortButton).click();
        driver.findElement(dropdownMenu).click();
    }

    public void goToShoppingCard () {
        driver.findElement(shoppingCardLink).click();
    }

    public void goToBurgerMenu() {
        driver.findElement(burgerMenuButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logoutButtonElement = wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
    }

    public void logoutFromTheSite() {
        driver.findElement(logoutButton).click();
    }
}
