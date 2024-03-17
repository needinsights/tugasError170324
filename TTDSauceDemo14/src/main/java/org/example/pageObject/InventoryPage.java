package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage {
    public static WebDriver webDriver;

    public InventoryPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement sortProduct;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    private WebElement productSauceJacket;
    @FindBy(xpath = "//span[@class='title']")
    private WebElement labelProduct;

    public void selectSortProduct(String text){
        Select select = new Select(sortProduct);
        select.selectByVisibleText(text);


    }
    public void clickProductSauceJacket(){
        productSauceJacket.click();
    }

    public boolean verifyLabelProduct(){
        return labelProduct.isDisplayed();
    }

    public void clickAddToCartItem(String item){
        String button = "//div[text()='" + item + "']/ancestor::div[@class='inventory_item_description']//button[text()='Add to cart']";
        webDriver.findElement(By.xpath(button)).click();



    }


}
