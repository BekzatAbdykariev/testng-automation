package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OrangeLoginPage {

    public OrangeLoginPage(){
        PageFactory.initElements(Driver.browser(), this);
    }

    @FindBy(name = "username")
    public WebElement loginInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button")
    public WebElement loginButton;

    @FindBy(xpath="//input[@name='username']/../../span")
    public WebElement requiredErrorUserName;

}
