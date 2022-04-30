package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By registerCompletionText = By.xpath("//div[contains(text(),'Your registration completed')]");



    public String getRegisterTab()
    {
        return getTextFromElement(registerText);
    }
    public void enterFirstName(String firstname)
    {
        sendTextToElement(firstNameField,firstname);
    }
    public void enterLastName(String lastname)
    {
        sendTextToElement(lastNameField,lastname);
    }
    public void enterEmail(String email)
    {
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password)
    {
        sendTextToElement(passwordField,password);
    }
    public void enterConfirmPassword(String confirmPassword)
    {
        sendTextToElement(confirmPasswordField,confirmPassword);
    }
    public void clickOnRegisterButton()
    {
        clickOnElement(registerButton);
    }
    public String getRegisterCompletionMessage()
    {
        return getTextFromElement(registerCompletionText);
    }
}
