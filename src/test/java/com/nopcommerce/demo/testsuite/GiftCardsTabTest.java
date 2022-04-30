package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.GiftCardsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftCardsTabTest extends TestBase {

    HomePage homePage = new HomePage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        homePage.clickOnGiftCardsTab();
        String expectedMessage = "Gift Cards";
        String actualMessage = giftCardsPage.getGiftCardsTab();
        Assert.assertEquals(expectedMessage,actualMessage,"error");
    }
}
