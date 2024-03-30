package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MessagingSteps {
    @Given("I have logged in to my LinkedIn account")
    public void loggedInToLinkedInAccount() {
        System.out.println("Logging into LinkedIn account...");
    }

    @When("I navigate to my connections or receive a message")
    public void navigateToMyConnections() {
        System.out.println("Navigating to connections or receiving message...");
    }

    @And("I click on the message icon")
    public void clickOnTheMessageIcon() {
        System.out.println("Clicking on the message icon...");
    }

    @And("I write a message")
    public void writeAMessage() {
        System.out.println("Writing a message...");
    }

    @And("I click on the \"Send\" button")
    public void clickOnSendButton() {
        System.out.println("Clicking 'Send' button...");
    }

    @Then("the message should be sent to the recipient")
    public void messageShouldBeSent() {
        System.out.println("Message sent successfully...");
    }

    @And("I tried to send a empty message")
    public void sendEmptyMessage() {
        System.out.println("Attempting to send empty message...");
    }

    @Then("I cannot click the \"Send\" button")
    public void cannotClickSendButton() {
        System.out.println("Button 'Send' is disabled...");
    }

    @When("I receive a message from a connection")
    public void receiveAMessage() {
        System.out.println("Receiving message from connection...");
    }

    @And("I should see the message in my inbox")
    public void seeMessageInMyInbox() {
        System.out.println("Message is visible in inbox...");
    }

    @Then("I be able to read and respond to it")
    public void beAbleToReadAndRespond() {
        System.out.println("Reading and responding to message...");
    }

    @When("I view a message in my inbox")
    public void viewAMessage() {
        System.out.println("Viewing message in inbox...");
    }

    @And("I click on the \"Delete\" button")
    public void clickOnTheDeleteButton() {
        System.out.println("Clicking 'Delete' button...");
    }

    @Then("the message should be removed from my inbox")
    public void theMessageRemovedFromMyInbox() {
        System.out.println("Message deleted successfully...");
    }

    @And("I click on the \"Archive\" button")
    public void clickOnTheArchiveButton() {
        System.out.println("Clicking 'Archive' button...");
    }

    @Then("the message should be moved to the archived folder")
    public void messageMovedToTheArchivedFolder() {
        System.out.println("Message archived successfully...");
    }
}
