package com.softwaretestingboard.magento;

import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import com.softwaretestingboard.magento.utilities.Utility;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {
    WomenPage womenPage=new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        womenPage.mouseHoverOnWomenLink();
        womenPage.mouseHoverOnTops();
        womenPage.mouseHoverAndClickOnJackets();
        womenPage.selectDropDownProduct();
        womenPage.storeJacketNamesInList();
        Thread.sleep(20);
    }
    @Test
    public void verifyTheSortByPriceFilter(){
        womenPage.mouseHoverOnWomenLink();
        womenPage.mouseHoverOnTops();
        womenPage.mouseHoverAndClickOnJackets();
        womenPage.selectDropDownPrice();

    }
}
