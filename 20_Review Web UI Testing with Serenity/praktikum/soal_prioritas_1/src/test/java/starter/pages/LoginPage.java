package starter.pages;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By usernameField() {
        return By.id("user-name");
    }

    private By passwordField() {
        return By.id("password");
    }

    private By loginButton() {
        return By.id("login-button");
    }

    private By errorMessage() {
        return By.xpath("//h3[@data-test='error']");
    }

//    private By addToCartButton() {
//        return By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
//    }

//    private By removeButton() {
//        return By.xpath("//button[@id='remove-sauce-labs-backpack']");
//    }

    @Step
    public boolean validateOnLoginPage() {
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputUsername(String username) {
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public  void clickLoginButton() {
        $(loginButton()).click();
    }

    @Step
    public boolean validateErrorMessageIsDisplayed() {
        return $(errorMessage()).isDisplayed();
    }

    @Step
    public boolean validateEqualErrorMessage(String message) {
        return $(errorMessage()).isDisplayed();
    }
}