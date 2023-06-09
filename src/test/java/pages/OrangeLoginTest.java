package pages;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

public class OrangeLoginTest {
    private OrangeLoginPage orangeLoginPage = new OrangeLoginPage();
    @Before
    public void before(){
        Driver.browser();
        System.out.println("Browser is opened! ");
    }

    @After
    public void after(){
        Driver.quit();
    }
    @Test
    @Ignore
    public void happyLogin() {
        Driver.browser().get(Config.getValue("URL"));
        WebElement usernameInput = orangeLoginPage.loginInput;
        usernameInput.sendKeys(Config.getValue("username"));
        WebElement passwrdInput = orangeLoginPage.passwordInput;
        passwrdInput.sendKeys(Config.getValue("password"));
        orangeLoginPage.loginButton.click();
        String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        Assert.assertEquals("Login failed", expectedURL, Driver.browser().getCurrentUrl());
    }



}
