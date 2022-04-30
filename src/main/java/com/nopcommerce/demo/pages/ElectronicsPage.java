package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {

    By electronicsTab = By.xpath("//h1[contains(text(),'Electronics')]");

    public String getElectronicsTab()
    {
        return  getTextFromElement(electronicsTab);
    }
}
