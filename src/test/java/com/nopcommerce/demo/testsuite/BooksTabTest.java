package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BooksPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BooksTabTest extends TestBase {

    HomePage homePage = new HomePage();
    BooksPage booksPage = new BooksPage();

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        homePage.clickOnBooksTab();
        String expectedMessage = "Books";
        String actualMessage = booksPage.getBooksTab();
        Assert.assertEquals(expectedMessage,actualMessage,"error");
    }
}
