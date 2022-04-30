package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTabTest extends TestBase {

    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){

    homePage.clickOnComputerTab();
    String expectedMessage = "Computers";
    String actualMessage = computerPage.getComputerTab();
    Assert.assertEquals(expectedMessage,actualMessage,"error");
    }
}
