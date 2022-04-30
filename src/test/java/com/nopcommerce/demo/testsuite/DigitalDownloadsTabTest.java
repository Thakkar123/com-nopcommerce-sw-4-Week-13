package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.DigitalDownloadsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DigitalDownloadsTabTest extends TestBase {

    HomePage homePage = new HomePage();
    DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage();

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){

        homePage.clickOnDigitalDownloadsTab();
        String expectedMessage = "Digital downloads";
        String actualMessage = digitalDownloadsPage.getDigitalDownloadsTab();
        Assert.assertEquals(expectedMessage,actualMessage,"error");

    }


}
