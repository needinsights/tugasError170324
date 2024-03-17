package step_definitions;

import hooks.Hooks;
import io.cucumber.java.bs.I;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pageObject.InventoryPage;
import org.example.pageObject.LoginPage;
import org.openqa.selenium.WebDriver;

public class InventorySteps {
private final WebDriver driver = Hooks.driver;
InventoryPage inventoryPage = new InventoryPage(driver);
LoginPage loginPage = new LoginPage(driver);

@And("user sort product by {string}")
    public void userSortProductBy(String text) throws InterruptedException {
    inventoryPage.selectSortProduct(text);
    Thread.sleep(3000);
    }


@And("User click add to cart item sauce labs fleece jacket")
    public void userClickAddToCartItemSauceLabsFleeceJacket() {
    inventoryPage.clickProductSauceJacket();

}

@And("User click add to cart item {string}")
    public void userClickAddToCartItem(String item) throws InterruptedException {
    inventoryPage.clickAddToCartItem(item);
    Thread.sleep(3000);
    }
}
