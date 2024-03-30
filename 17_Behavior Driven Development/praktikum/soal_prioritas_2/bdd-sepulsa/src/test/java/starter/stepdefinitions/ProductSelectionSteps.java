package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSelectionSteps {
    @Given("I am logged into my Sepulsa account")
    public void loggedIntoSepulsaAccount() {
        System.out.println("Logging into Sepulsa account...");
    }

    @When("I navigate to the products section")
    public void navigateToTheProductSection() {
        System.out.println("Navigating to the products section...");
    }

    @And("I browse the available products")
    public void browseAvailableProducts() {
        System.out.println("Browsing available products...");
    }

    @And("I select a product")
    public void selectProduct() {
        System.out.println("Selecting a product...");
    }

    @Then("I should see the product details")
    public void seeProductDetails() {
        System.out.println("Viewing product details...");
    }

    @And("I see that one or more of the options for that product is not available")
    public void productUnavailable() {
        System.out.println("Checking for unavailable product options...");
    }

    @Then("I can't select that option")
    public void cannotSelectThatOption() {
        System.out.println("Option is unavailable, cannot select...");
    }
}
