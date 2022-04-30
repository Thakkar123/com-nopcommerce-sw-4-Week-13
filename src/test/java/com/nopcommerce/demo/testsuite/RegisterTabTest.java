package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTabTest extends TestBase {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegisterLink();
        String expectedMessage = "Register";
        String actualMessage = registerPage.getRegisterTab();
        Assert.assertEquals(expectedMessage,actualMessage,"error");
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.enterFirstName("Ramesh");
        registerPage.enterLastName("Patel");
        registerPage.enterEmail("RameshPatel123@gmail.com");
        registerPage.enterPassword("Temp1234");
        registerPage.enterConfirmPassword("Temp1234");
        registerPage.clickOnRegisterButton();
        String expectedMessage = "Your registration completed";
        String actualMessage = registerPage.getRegisterCompletionMessage();
        Assert.assertEquals(expectedMessage,actualMessage,"Register not completed");

     }
}
