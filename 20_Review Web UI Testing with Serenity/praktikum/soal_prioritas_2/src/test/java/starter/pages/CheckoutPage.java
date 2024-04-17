package starter.pages;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutPage extends PageObject {
    private By total() {
        return By.className("headertrans");
    }

    private By paymentDetails() {
        return By.xpath("//p[@id='panel_summary']");
    }

    private By paymentMethod() {
        return By.id("section-list-payment");
    }

    private By selectMethod() {
        return By.className("jss1192");
    }

    private By paymentButton() {
        return By.id("submit_payment");
    }

    private By promoField() {
        return By.id("promotion_code");
    }

    private By notifMessage() {
        return By.xpath("//p[@id='error_select_payment']");
    }

    @Step
    public boolean validateOnCheckoutPage() {
        return $(total()).isDisplayed();
    }

    @Step
    public boolean availableDetails() {
        return $(paymentDetails()).isDisplayed();
    }

    @Step
    public boolean availablePaymentMethod() {
        return $(paymentMethod()).isDisplayed();
    }

    @Step
    public void clickMethod() {
        $(selectMethod()).click();
    }

    @Step
    public void clickPaymentButton() {
        $(paymentButton()).click();
    }

    @Step
    public void inputPromo(String promo) {
        $(promoField()).type(promo);
    }

    @Step
    public boolean validateNotifMessageIsDisplayed() {
        return $(notifMessage()).isDisplayed();
    }

    @Step
    public boolean validateEqualNotifMessage(String message) {
        return $(notifMessage()).isDisplayed();
    }
}
