package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConnectionManagementSteps {
    @Given("I am on the homepage")
    public void onTheHomePage() {
        System.out.println("Navigating to the homepage...");
    }

    @When("I enter a name in the search bar")
    public void enterNameInIheSearchBar() {
        System.out.println("Entering a name in the search bar...");
    }

    @And("I click on the search button")
    public void clickOnTheSearchButton() {
        System.out.println("Clicking on the search button...");
    }

    @Then("I should see a list of connections matching the name")
    public void seeListOfConnections() {
        System.out.println("Seeing a list of connections matching the name...");
    }

    @When("I search for a user")
    public void searchForUser() {
        System.out.println("Searching for a user...");
    }

    @And("I click on the \"Connect\" button next to their profile")
    public void clickOnTheConnectButton() {
        System.out.println("Clicking on the 'Connect' button...");
    }

    @Then("a connection request should be sent")
    public void connectionRequestSent() {
        System.out.println("Connection request sent...");
    }

    @Given("I have pending connection requests")
    public void pendingConnectionRequest() {
        System.out.println("I have pending connection requests...");
    }

    @When("I navigate to the \"My Network\" tab")
    public void navigateToMyNetworkTab() {
        System.out.println("Navigating to the 'My Network' tab...");
    }

    @And("I click on the \"Manage all\" button under \"Invitations\"")
    public void clickOnTheManageAllButton() {
        System.out.println("Clicking on the 'Manage all' button...");
    }

    @And("I accept a pending request")
    public void acceptPendingRequest() {
        System.out.println("Accepting a pending request...");
    }

    @Then("the connection should be added to my network")
    public void connectionAdded() {
        System.out.println("Connection added to my network...");
    }

    @Given("I am a LinkedIn user with a public profile")
    public void userWithPublicProfile() {
        System.out.println("I am a LinkedIn user with a public profile...");
    }

    @When("I send an overwhelming number of connection requests over a few days")
    public void sendOverwhelmingConnectionRequest() {
        System.out.println("Sending an overwhelming number of connection requests over a few days...");
    }

    @Then("my account should be temporarily restricted")
    public void accountTemporarilyRestricted() {
        System.out.println("My account should be temporarily restricted...");
    }
}
