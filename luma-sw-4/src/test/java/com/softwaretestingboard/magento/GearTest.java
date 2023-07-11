package com.softwaretestingboard.magento;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    GearPage gearPage=new GearPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        gearPage.mouseHoverOnGearLink();
        gearPage.mouseHoverAndClickOnBagLink();
        gearPage.clickOnDuffleLink();
        gearPage.getDuffleText();
        String exp="Overnight Duffle";
        Assert.assertEquals(gearPage.getDuffleText(),exp,"Text not matched");
        gearPage.changeQty();
        Thread.sleep(20);
        gearPage.clickAddToCart();
        String exp1="You added Overnight Duffle to your shopping cart.";
        Assert.assertEquals(gearPage.getAddToCartText(),exp1,"Text not matched");
        gearPage.clickOnShoppingCartLinkInMessage();
    }}