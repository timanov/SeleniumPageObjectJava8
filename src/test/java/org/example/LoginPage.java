package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(xpath = "//*[@id=\"passp-field-login\"]")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id=\"passp:sign-in\"]")
    private WebElement buttonEnter;

    @FindBy(xpath = "//*[@id=\"passp-field-passwd\"]")
    private WebElement passwdField;
    

}
