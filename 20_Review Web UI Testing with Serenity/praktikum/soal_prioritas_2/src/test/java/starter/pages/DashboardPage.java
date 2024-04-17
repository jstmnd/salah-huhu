package starter.pages;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.time.Duration;

public class DashboardPage extends PageObject {
    private By title() {
        return By.className("headerNav");
    }

    private By productSection() {
        return By.id("Lainnya");
    }

    private By selectProduct() {
        return By.id("product_type_0");
    }

    private By numberField() {
        return By.id("phone_number");
    }

    private By availableProduct() {
        return By.xpath("//*[@id=\"Telkomsel Rp20.000\"]");
    }

    private By unavailableProductMessage() {
        return By.xpath("//*[@id=\"Telkomsel Rp75.000\"]/p[1]");
    }

    @Step
    public boolean validateOnDashboardPage() {
        return $(title()).isDisplayed();
    }

    @Step
    public void clickProductSection() {
        $(productSection()).click();
    }

    @Step
    public void clickProduct() {
        $(selectProduct()).click();
    }

    @Step
    public void inputNumber(String phone_number) {
        $(numberField()).type(phone_number);
    }

    @Step
    public boolean availableOption() {
        return $(availableProduct()).isPresent();
    }

    @Step
    public boolean isProductUnavailable() {
        return $(unavailableProductMessage()).isPresent();
    }
}