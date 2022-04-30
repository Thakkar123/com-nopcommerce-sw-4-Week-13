package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.JewelryPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JewelryTabTest extends TestBase {

    HomePage homePage = new HomePage();
    JewelryPage jewelryPage = new JewelryPage();

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        homePage.clickOnJewelryTab();
        String expectedMessage = "Jewelry";
        String actualMessage = jewelryPage.getJewelryTab();
        Assert.assertEquals(expectedMessage,actualMessage,"error");
    }
}
