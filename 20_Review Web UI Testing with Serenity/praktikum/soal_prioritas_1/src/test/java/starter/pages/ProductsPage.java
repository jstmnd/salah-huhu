package starter.pages;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductsPage extends PageObject {
    private By title() {
        return By.className("app_logo");
    }

    private By addToCartButton() {
        return By.id("add-to-cart-sauce-labs-backpack");
    }

    private By cartCounter() {
        return By.className("shopping_cart_badge");
    }

    private By removeButton() {
        return By.xpath("//button[@id='remove-sauce-labs-backpack']");
    }

    @Step
    public boolean validateOnProductsPage() {
        return $(title()).isDisplayed();
    }

    @Step
    public void clickAddItemToCart() {
        $(addToCartButton()).click();
    }

    @Step
    public boolean validateCartCounterIsDisplayed() {
        return $(cartCounter()).isDisplayed();
    }

    @Step
    public boolean validateCartCounter() {
        return $(cartCounter()).getText().equals("1");
    }

    @Step
    public boolean isRemoveButtonDisplayed() {
        return findAll(removeButton()).size() > 0 && $(removeButton()).isDisplayed();
    }
}