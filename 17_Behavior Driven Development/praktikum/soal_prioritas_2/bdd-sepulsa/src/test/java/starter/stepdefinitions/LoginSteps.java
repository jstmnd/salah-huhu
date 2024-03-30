package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("I am on the login page")
    public void onTheLoginPage() {
        System.out.println("Navigating to the login page...");
    }

    @When("I enter valid phone number or email and password")
    public void enterValidCredentials() {
        System.out.println("Entering valid credentials...");
    }

    @And("I click on the \"Masuk\" button")
    public void clickOnTheLoginButton() {
        System.out.println("Clicking 'Masuk' button...");
    }

    @Then("I should be redirected to the dashboard")
    public void redirectedToTheDashboard() {
        System.out.println("Redirecting to the dashboard...");
    }

    @When("I enter invalid phone number or email and password")
    public void enterInvalidCredentials() {
        System.out.println("Entering invalid credentials...");
    }

    @Then("I should see an error message indicating invalid credentials")
    public void seeAnErrorMessage() {
        System.out.println("Seeing error message for invalid credentials...");
    }

    @When("I leave the phone number or email and password fields empty")
    public void leavingEmptyCredentials() {
        System.out.println("Leaving fields empty...");
    }

    @Then("I cannot click \"Masuk\" button")
    public void cannotClickLoginButton() {
        System.out.println("Button 'Masuk' is disabled...");
    }
}