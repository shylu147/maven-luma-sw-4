package com.softwaretestingboard.magento;

import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    MenPage menPage=new MenPage();
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        menPage.mouseHoverOnMenLink();
        menPage.mouseHoverOnBottoms();
        menPage.mouseHoverAndClickOnPants();
        menPage.mouseHoverOnCronus();
        menPage.mouseHoverAndClickOnSize();
        menPage.mouseHoverAndClickOnAddToCart();
    }
}
