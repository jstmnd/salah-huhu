package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.DashboardPage;
import starter.pages.CheckoutPage;

public class ProductSelectionSteps {
    @Steps
    DashboardPage dashboardPage;

    @Steps
    CheckoutPage checkoutPage;

    @And("I navigate to the products section")
    public void navigateProductSection() {
        dashboardPage.clickProductSection();
    }

    @And("I select a product")
    public void selectProduct() {
        dashboardPage.clickProduct();
    }

    @And("I input my number")
    public void inputNumber() {
        dashboardPage.inputNumber("08214439272");
    }

    @And("I select available option")
    public void selectAvailableOption() {
        Assertions.assertTrue(dashboardPage.availableOption());
    }

    @Then("I am on the checkout page")
    public void onTheProductDetailPage() {
        Assertions.assertTrue(checkoutPage.validateOnCheckoutPage());
    }

    @Then("I can't select unavailable option")
    public void iCantSelectUnavailableOption() {
        Assertions.assertTrue(dashboardPage.isProductUnavailable());
    }
}
