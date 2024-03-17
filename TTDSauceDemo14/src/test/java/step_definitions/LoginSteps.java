package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.InventoryPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private final WebDriver driver = Hooks.driver;

    LoginPage loginPage = new LoginPage(driver);

    InventoryPage inventoryPage = new InventoryPage(driver);


    @Given("User open the app sauce demo")
    public void userOpenTheAppSauceDemo() {
        Assert.assertTrue(loginPage.verifyLoginPage());
    }
    @When("user input {string} as userName and {string} as password and click login")
    public void credential(String userName, String password){

        loginPage.inputFieldUserName(userName);
        loginPage.inputFieldPassword(password);
        loginPage.clickButtonLogin();
    }
    @Then("User already on dashboard page")
    public void userAlreadyOnDashboardPage() {
        Assert.assertTrue(inventoryPage.verifyLabelProduct());
    }

    @When("User input {string} as userName and {string} as password")
    public void userInputAsUserNameAndAsPassword(String userName, String password) {

        loginPage.inputFieldUserName(userName);
        loginPage.inputFieldPassword(password);
        loginPage.clickButtonLogin();
    }
    @Then("User see {string} as error text")
    public void userSeeAsErrorText(String text) {
        Assert.assertEquals(text, loginPage.getErrorMessage());
    }
}
