package org.example;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static LoginPage loginPage;
    public static ProfilePage profilePage;
    public static WebDriver driver;

    /**
     * осуществление первоночальной настройки
     */

    @BeforeClass
    public static void main(String[] args) {
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        driver = new ChromeDriver();
        //определние пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //создание экземпляра драйвера
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @Test
    public void loginTest() {
        //значение login/password берутся из файла настроек по аналогии с chromedriver и login page
        //вводим логин
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        //нажимаем кнопку входа
        loginPage.clickLoginBtn();
        //вводим пароль
        loginPage.inputPasswd(ConfProperties.getProperty("password"));
        //нажимаем на иконку пользователя
        profilePage.entryMenu();
        //получаем отображаемый логин
        String user = profilePage.getUserName();}
        //сравниваем полученный логин с логином из файла настроек
}
