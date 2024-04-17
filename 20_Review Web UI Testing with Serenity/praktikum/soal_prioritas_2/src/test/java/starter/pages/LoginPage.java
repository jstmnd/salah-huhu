package starter.pages;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By emailField() {
        return By.id("email");
    }

    private By passwordField() {
        return By.id("password");
    }

    private By loginButton() {
        return By.id("submit_login");
    }

    private By errorMessage() {
        return By.xpath("//p[@id='alert_description']");
    }

    @Step
    public boolean validateOnLoginPage() {
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton() {
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

    @Step
    public boolean isLoginButtonDisplayed() {
        return findAll(loginButton()).size() > 0 && $(loginButton()).isDisplayed();
    }
}
