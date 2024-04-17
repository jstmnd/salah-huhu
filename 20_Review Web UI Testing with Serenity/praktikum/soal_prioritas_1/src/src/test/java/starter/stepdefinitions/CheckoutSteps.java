package starter.stepdefinitions;

import io.cucumber.java.en.And;
import net.serenitybdd.annotations.Steps;
import starter.pages.CheckoutPage;

public class CheckoutSteps {
    @Steps
    CheckoutPage checkoutPage;

    @And("I go to the cart page")
    public void goToCartPage() {
        checkoutPage.clickCartButton();
    }

    @And("I click checkout button")
    public void iClickCheckoutButton() {
        checkoutPage.clickCheckoutButton();
    }

    @And("I input first name")
    public void iInputFirstName() {
        checkoutPage.inputFirstName("Amanda");
    }

    @And("I input last name")
    public void iInputLastName() {
        checkoutPage.inputLastName("Putri");
    }

    @And("I input postal code")
    public void iInputPostalCode() {
        checkoutPage.inputPostalCode("2505");
    }

    @And("I click continue button")
    public void iClickContinueButton() {
        checkoutPage.clickContinueButton();
    }

    @And("I click finish button")
    public void iClickFinishButton() {
        checkoutPage.clickFinishButton();
    }
}
