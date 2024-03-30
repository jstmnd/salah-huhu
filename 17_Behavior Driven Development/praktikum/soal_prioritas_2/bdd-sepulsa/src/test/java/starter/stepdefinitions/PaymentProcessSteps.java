package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentProcessSteps {
    @Given("I am on the checkout page")
    public void onTheCheckoutPage() {
        System.out.println("Navigating to the checkout page...");
    }

    @When("I see the payment details")
    public void seePaymentDetails() {
        System.out.println("Viewing payment details...");
    }

    @And("I see the available payment methods")
    public void seeAvailablePaymentMethods() {
        System.out.println("Viewing available payment methods...");
    }

    @And("I select a payment method")
    public void selectPaymentMethod() {
        System.out.println("Selecting a payment method...");
    }

    @Then("I click \"Bayar Sekarang\" button")
    public void clickPayNowButton() {
        System.out.println("Clicking 'Bayar Sekarang' button...");
    }

    @And("I entered the promo code in the promo code section")
    public void enterThePromoCode() {
        System.out.println("Entering promo code...");
    }

    @Given("I have completed the payment process")
    public void haveCompletePaymentProcess() {
        System.out.println("Completing payment process...");
    }

    @When("I receive a payment confirmation")
    public void receivePaymentConfirmation() {
        System.out.println("Receiving payment confirmation...");
    }

    @Then("I should see a confirmation message")
    public void seeConformationMessage() {
        System.out.println("Viewing confirmation message...");
    }

    @And("I waited until the payment time was up without making a transaction")
    public void waitedUntilTimeout() {
        System.out.println("Waiting for payment timeout...");
    }

    @Then("an error message will be displayed that the payment time has expired and directed back to the Sepulsa application")
    public void errorMessagePaymentTimeout() {
        System.out.println("Displaying payment timeout error message...");
    }
}
