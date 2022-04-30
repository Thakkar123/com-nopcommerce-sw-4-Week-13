package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTabTest extends TestBase {

    HomePage homePage = new HomePage();
    ElectronicsPage electronicsPage = new ElectronicsPage();

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){

        homePage.clickOnElectronicsTab();
        String expectedMessage = "Electronics";
        String actualMessage = electronicsPage.getElectronicsTab();
        Assert.assertEquals(expectedMessage,actualMessage,"error");

    }

}
