package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homePage = new HomePage();
    ApparelPage apparelPage = new ApparelPage();

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){

        homePage.clickOnApparelTab();
        String actualMessage = apparelPage.getApparelTab();
        Assert.assertEquals(actualMessage,"Apparel","error");
    }

    BooksPage booksPage = new BooksPage();
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        homePage.clickOnBooksTab();
        String actualMessage = booksPage.getBooksTab();
        Assert.assertEquals(actualMessage,"Books","error");
    }
    ComputerPage computerPage = new ComputerPage();
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){

        homePage.clickOnComputerTab();
        String actualMessage = computerPage.getComputerTab();
        Assert.assertEquals(actualMessage,"Computers","error");
    }
    DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage();
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){

        homePage.clickOnDigitalDownloadsTab();
        String actualMessage = digitalDownloadsPage.getDigitalDownloadsTab();
        Assert.assertEquals(actualMessage,"Digital downloads","error");
    }

    ElectronicsPage electronicsPage = new ElectronicsPage();

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){

        homePage.clickOnElectronicsTab();
        String actualMessage = electronicsPage.getElectronicsTab();
        Assert.assertEquals(actualMessage,"Electronics","error");
    }

    GiftCardsPage giftCardsPage = new GiftCardsPage();

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        homePage.clickOnGiftCardsTab();
        String actualMessage = giftCardsPage.getGiftCardsTab();
        Assert.assertEquals(actualMessage,"Gift Cards","error");
    }
    JewelryPage jewelryPage = new JewelryPage();
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        homePage.clickOnJewelryTab();
        String actualMessage = jewelryPage.getJewelryTab();
        Assert.assertEquals(actualMessage,"Jewelry","error");
    }

}
