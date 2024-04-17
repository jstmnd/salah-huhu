package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.LoginPage;
import starter.pages.DashboardPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    DashboardPage dashboardPage;

    @Given("I am on the login page")
    public void onTheLoginPage() {
        loginPage.openUrl("https://www.sepulsa.com/signin");
        Assertions.assertTrue(loginPage.validateOnLoginPage());
    }

    @When("I input valid email")
    public void inputValidEmail() {
        loginPage.inputEmail("putrimanda985@gmail.com");
    }

    @And("I input valid password")
    public void inputValidPassword() {
        loginPage.inputPassword("220703Amanda_");
    }

    @And("I click on the \"Masuk\" button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I am on the dashboard page")
    public void onTheDashboardPage() {
        Assertions.assertTrue(dashboardPage.validateOnDashboardPage());
    }

    @When("I input invalid email")
    public void inputInvalidEmail() {
        loginPage.inputEmail("asdfghjk");
    }

    @And("I input invalid password")
    public void inputInvalidPassword() {
        loginPage.inputPassword("expassword");
    }

    @Then("I can see error message {string}")
    public void validateErrorMessageIsDisplayed(String message) {
        Assertions.assertTrue(loginPage.validateErrorMessageIsDisplayed());
        Assertions.assertTrue(loginPage.validateEqualErrorMessage(message));
    }

    @When("I leave the phone number or email and password fields empty")
    public void inputEmptyCredentials() {
        loginPage.inputEmail(" ");
        loginPage.inputPassword(" ");
    }

    @Then("I cannot click \"Masuk\" button")
    public void cannotClickButton() {
        assert loginPage.isLoginButtonDisplayed();
    }
}
