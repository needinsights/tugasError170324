package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.Zip;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    public static WebDriver webDriver;

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//a[.='2']")
    private WebElement cartButton;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
    private WebElement removeSauceLabs;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement Firstname;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement Lastname;
    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement Zipcode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement ClickContinue;

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement SumaryTotal;
    @FindBy(xpath = "//button[@id='finish']" )
    private WebElement ClickFinish;

    @FindBy(xpath = "//div[@id='checkout_complete_container']")
    private WebElement CheckoutComplete;




    public void clickCartButton() {
        cartButton.click();
    }
    public void removeSauceLabs(){
        removeSauceLabs.click();
    }
    public void clickCheckoutButton(){
        checkoutButton.click();
    }

    public boolean verivyCheckoutStepOne(){
        boolean a = Firstname.isDisplayed();
        boolean b = Lastname.isDisplayed();
        boolean c = Zipcode.isDisplayed();
        return a && b && c;
    }
    public void inputFirstName(String firstname, String lastname, String zipcode){
        Firstname.sendKeys(firstname);
        Lastname.sendKeys(lastname);
        Zipcode.sendKeys(zipcode);
    }
    public void clickContinueButton(){
        ClickContinue.click();
    }
    public boolean verivyCheckoutStepTwo(){
        return SumaryTotal.isDisplayed();
    }
    public void clickFinishButton(){
        ClickFinish.click();
    }
    public boolean verivyCheckoutComplete(){
        return CheckoutComplete.isDisplayed();
    }
}