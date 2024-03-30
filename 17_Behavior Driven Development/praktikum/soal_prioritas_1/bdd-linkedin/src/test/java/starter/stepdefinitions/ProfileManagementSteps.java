package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileManagementSteps {
    @Given("I am on the home page")
    public void onHomePage() {
        System.out.println("Navigating to the home page...");
    }

    @When("I navigate to the \"Me\" tab and select \"View profile\"")
    public void navigateToMeTab() {
        System.out.println("Navigating to the 'Me' tab");
    }

    @And("I click on the \"Edit\" button")
    public void clickOnTheEditIcon() {
        System.out.println("Clicking 'Edit' button...");
    }

    @And("I update my profile information")
    public void updateMyProfileInformation() {
        System.out.println("Updating profile information...");
    }

    @And("I click on the \"Save\" button")
    public void clickOnTheSaveButton() {
        System.out.println("Clicking 'Save' button...");
    }

    @Then("my profile should be updated with the new information")
    public void myProfileUpdated() {
        System.out.println("Profile updated successfully...");
    }

    @And("I attempt to delete mandatory profile information such as first name or last name")
    public void deleteMandatoryProfileInformation() {
        System.out.println("Attempting to delete mandatory profile information...");
    }

    @Then("I should receive an error message indicating that the field is required and cannot be left blank")
    public void receiveAnErrorMessage() {
        System.out.println("Seeing error message for mandatory field...");
    }
}
