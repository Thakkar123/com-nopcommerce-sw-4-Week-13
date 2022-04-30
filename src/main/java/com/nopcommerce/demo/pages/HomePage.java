package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");
    By computers = By.linkText("Computers");
    By electronics = By.linkText("Electronics");
    By apparel = By.linkText("Apparel");
    By digitalDownloads = By.linkText("Digital downloads");
    By books = By.linkText("Books");
    By jewelry = By.linkText("Jewelry");
    By giftCards = By.linkText("Gift Cards");

    public void clickOnLoginLink()
    {
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink()
    {
        clickOnElement(registerLink);
    }
    public void clickOnComputerTab()
    {
        clickOnElement(computers);
    }
    public void clickOnElectronicsTab()
    {
        clickOnElement(electronics);
    }
    public void clickOnApparelTab()
    {
        clickOnElement(apparel);
    }
    public void clickOnDigitalDownloadsTab()
    {
        clickOnElement(digitalDownloads);
    }
    public void clickOnBooksTab()
    {
        clickOnElement(books);
    }
    public void clickOnJewelryTab()
    {
        clickOnElement(jewelry);
    }
    public void clickOnGiftCardsTab()
    {
        clickOnElement(giftCards);
    }

}
