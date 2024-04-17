package starter.pages;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutPage extends PageObject {
    private By cartButton() {
        return By.className("shopping_cart_container");
    }

    private By checkoutButton() {
        return By.id("checkout");
    }

    private By firstNameField() {
        return By.id("first-name");
    }

    private By lastNameField() {
        return By.id("last-name");
    }

    private By postalCodeField() {
        return By.id("postal-code");
    }

    private By continueButton() {
        return By.id("continue");
    }

    private By finishButton() {
        return By.id("finish");
    }

    @Step
    public void clickCartButton() {
        $(cartButton()).click();
    }

    @Step
    public void clickCheckoutButton() {
        $(checkoutButton()).click();
    }

    @Step
    public void inputFirstName(String firstname) {
        $(firstNameField()).type(firstname);
    }

    @Step
    public void inputLastName(String lastname) {
        $(lastNameField()).type(lastname);
    }

    @Step
    public void inputPostalCode(String postalcode) {
        $(postalCodeField()).type(postalcode);
    }

    @Step
    public void clickContinueButton() {
        $(continueButton()).click();
    }

    @Step
    public void clickFinishButton() {
        $(finishButton()).click();
    }
}
