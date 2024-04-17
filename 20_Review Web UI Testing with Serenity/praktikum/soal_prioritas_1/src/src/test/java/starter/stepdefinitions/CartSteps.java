package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.LoginPage;
import starter.pages.ProductsPage;

public class CartSteps {
    @Steps
    ProductsPage productsPage;

    @Steps
    LoginPage loginPage;

    @And("I add item to the cart")
    public void addItemToTheCart() {
        productsPage.clickAddItemToCart();
    }

    @Then("the item is added to the cart")
    public void validateCart() {
        Assertions.assertTrue(productsPage.validateCartCounterIsDisplayed());
        Assertions.assertTrue((productsPage.validateCartCounter()));
    }

    @When("I input error username")
    public void inputErrorUsername() {
        loginPage.inputUsername("error_user");
    }

    @Then("I cannot add item to the cart")
    public void cannotAddItemToTheCart() {
        productsPage.clickAnotherItemToCart();
    }

    @When("I input problem username")
    public void inputProblemUsername() {
        loginPage.inputUsername("problem_user");
    }

    @Then("I cannot remove it")
    public void iCannotRemoveIt() {
        assert productsPage.isRemoveButtonDisplayed();
    }
}
