package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {

    By menLink = By.xpath("//span[normalize-space()='Men']");
    By bottoms = By.xpath("//a[@id='ui-id-18']");
    By pants=By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By cronusYogaPant=By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size=By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");

    By addToCart=By.xpath("/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[4]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");


    public void mouseHoverOnMenLink() {mouseHoverToElement(menLink);}
    public void mouseHoverOnBottoms() {mouseHoverToElement(bottoms);}
    public void mouseHoverAndClickOnPants() {mouseHoverToElementAndClick(pants);}
    public void mouseHoverOnCronus() {mouseHoverToElement(cronusYogaPant);}
    public void mouseHoverAndClickOnSize() {mouseHoverToElementAndClick(size);}

    public void mouseHoverAndClickOnAddToCart() {mouseHoverToElementAndClick(addToCart);}


}
