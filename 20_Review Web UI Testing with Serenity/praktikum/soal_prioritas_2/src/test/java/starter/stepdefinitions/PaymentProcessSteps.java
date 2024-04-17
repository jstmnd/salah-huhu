package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.CheckoutPage;

public class PaymentProcessSteps {

    @Steps
    CheckoutPage checkoutPage;

    @And("I navigate to the checkout page")
    public void navigateCheckoutPage() {
        Assertions.assertTrue(checkoutPage.validateOnCheckoutPage());
    }

    @And("I see the payment details")
    public void seePaymentDetails() {
        Assertions.assertTrue(checkoutPage.availableDetails());
    }

    @And("I see the available payment methods")
    public void seePaymentMethod() {
        Assertions.assertTrue(checkoutPage.availablePaymentMethod());
    }

    @And("I select a payment method")
    public void selectPaymentMethod() {
        checkoutPage.clickMethod();
    }

    @Then("I click \"Bayar Sekarang\" button")
    public void clickBayarSekarangButton() {
        checkoutPage.clickPaymentButton();
    }

    @And("I entered the promo code in the promo code section")
    public void enteredPromoCode() {
        checkoutPage.inputPromo("user.email");
    }

    @Then("I can see notification message {string}")
    public void validateNotifMessageIsDisplayed(String message) {
        Assertions.assertTrue(checkoutPage.validateNotifMessageIsDisplayed());
        Assertions.assertTrue(checkoutPage.validateEqualNotifMessage(message));
    }
}
