package org.example.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class LoginPage {

    private static Logger log = Logger.getLogger(LoginPage.class.getName());

    public WebDriver driver;
    /**
     * конструктор класса, заниающийся инициализацией полей класса
     */
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    /**
     * определение локатора для нажатии на кнопку [Почта]
     */
//    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/div[1]/form/div[1]/div[2]/button")
//    private WebElement buttonMail;
    /**
     * определение локатора поля ввода логина
     */
    @FindBy(xpath = "//*[@id=\"passp-field-login\"]")
    private WebElement loginField;
    /**
     * определение локатора кнопки входа в аккаунт
     */
    @FindBy(xpath = "//*[@id=\"passp:sign-in\"]")
    private WebElement buttonEnter;
    /**
     * определение локатора поля ввода пароля
     */
    @FindBy(xpath = "//*[@id=\"passp-field-passwd\"]")
    private WebElement passwdField;

    /**
     * метод для выбора автоаризации по почте
     */
    //public void clickEmailBtn() { buttonMail.click(); }
    /**
     * метод для ввода логина
     */
    public void inputLogin(String login) {
        log.info("Вводим логин");
        loginField.sendKeys(login);
    }
    /**
     * метод для ввода пароля
     */
    public void inputPasswd(String passwd) {
        log.info("Вводим пароль");
        passwdField.sendKeys(passwd);
    }
    /**
     * метод для осуществления нажатия кнопки входа в аккаунт
     */
    public void clickLoginBtn() {
        log.info("Нажимаем кнопку войти");
        buttonEnter.click();
    }


}
