package io.github.mfaisalkhatri.juiceshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created By Faisal Khatri on 18-04-2022
 */
public class AddressPage {

    private final WebDriver driver;

    public AddressPage (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement addressForm () {
        return driver.findElement(By.id("address-form"));
    }

    public WebElement countryField () {
        return addressForm().findElement(By.cssSelector(".mat-form-field:nth-child(1) input"));
    }

    public WebElement nameField () {
        return addressForm().findElement(By.cssSelector(".mat-form-field:nth-child(2) input"));
    }

    public WebElement mobileNumberField () {
        return addressForm().findElement(By.cssSelector(".mat-form-field:nth-child(3) input"));
    }

    public WebElement zipCodeField () {
        return addressForm().findElement(By.cssSelector(".mat-form-field:nth-child(4) input"));
    }

    public WebElement addressField () {
        return addressForm().findElement(By.cssSelector(".mat-form-field:nth-child(5) textarea"));
    }

    public WebElement cityField () {
        return addressForm().findElement(By.cssSelector(".mat-form-field:nth-child(6) input"));
    }

    public WebElement stateField () {
        return addressForm().findElement(By.cssSelector(".mat-form-field:nth-child(7) input"));
    }

    public WebElement submitBtn () {
        return driver.findElement(By.id("submitButton"));
    }

    public WebElement selectAddressRadioBtn () {
        return driver.findElement(By.cssSelector("mat-cell > mat-radio-button"));
    }

    public WebElement continueBtn () {
        return driver.findElement(By.cssSelector(".btn.btn-next"));
    }
}