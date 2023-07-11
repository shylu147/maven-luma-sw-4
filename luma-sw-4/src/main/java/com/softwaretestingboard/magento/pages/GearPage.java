package com.softwaretestingboard.magento.pages;


import com.softwaretestingboard.magento.utilities.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    By gearLink = By.xpath("//span[normalize-space()='Gear']");
    By bagLink = By.xpath("//span[normalize-space()='Bags']");
    By duffleLink = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By duffleText = By.xpath("//span[@class='base']");
    By qty = By.xpath("//input[@id='qty']");
    By addToCart=By.xpath("//button[@id='product-addtocart-button']");
    By addToCartText=By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    By shoppingCartLinkInMessage=By.xpath("//a[normalize-space()='shopping cart']");

    public void mouseHoverOnGearLink() {
        mouseHoverToElement(gearLink);
    }

    public void mouseHoverAndClickOnBagLink() {
        mouseHoverToElementAndClick(bagLink);
    }

    public void clickOnDuffleLink() {
        clickOnElement(duffleLink);
    }

    public String getDuffleText() {
        getTextFromElement(duffleText);
        {
            return getTextFromElement(duffleText);}}
    public void changeQty(){
        sendTextToElement(qty,"3");
    }
    public void clickAddToCart(){
        clickOnElement(addToCart);
    }
    public String getAddToCartText(){
        return getTextFromElement(addToCartText);
    }
    public void clickOnShoppingCartLinkInMessage(){
        clickOnElement(shoppingCartLinkInMessage);
    }
}
