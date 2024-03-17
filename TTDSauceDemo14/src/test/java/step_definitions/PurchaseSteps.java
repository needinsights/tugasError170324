package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageObject.CheckoutPage;
import org.example.pageObject.InventoryPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PurchaseSteps {
    private final WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);
    InventoryPage inventoryPage = new InventoryPage(driver);
    CheckoutPage checkoutPage = new CheckoutPage(driver);



    @Then("User click shopping cart badge")
        public void userClickCartButton(){
            checkoutPage.clickCartButton();
    }

    @And("User remove {string} from shopping cart")
    public void userRemoveFromShoppingCart() {
        checkoutPage.removeSauceLabs();
    }

    @And("User click Checkout button")
    public void userClickCheckoutButton() {
        checkoutPage.clickCheckoutButton();
        
    }

    @Then("User redirected to Checkout Step One page")
    public void userRedirectedToCheckoutStepOnePage() {
        Assert.assertTrue(checkoutPage.verivyCheckoutStepOne());
    }

    @And("User input {string} as FirstName {string} as LastName {string} as ZipCode")
    public void userInputAsFirstNameAsLastNameAsZipCode(String firstname, String lastname, String zipcode) {
        checkoutPage.inputFirstName(firstname,lastname,zipcode);
    }

    @And("User click Continue button")
    public void userClickContinueButton() {
        checkoutPage.clickContinueButton();
    }

    @Then("User redirected to Checkout Step Two page")
    public void userRedirectedToCheckoutStepTwoPage() {
        Assert.assertTrue(checkoutPage.verivyCheckoutStepTwo());
    }

    @And("User click Finish button")
    public void userClickFinishButton() {
        checkoutPage.clickFinishButton();
    }

    @Then("User redirected to Checkout Complete page")
    public void userRedirectedToCheckoutCompletePage() {
        Assert.assertTrue(checkoutPage.verivyCheckoutComplete());
    }
}
