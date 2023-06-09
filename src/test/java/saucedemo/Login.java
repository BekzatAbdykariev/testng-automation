package saucedemo;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.InputMismatchException;


public class Login{

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("Bekzat");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Hello123");
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
        WebElement errorMessage = driver.findElement(By.tagName("h3"));
        String message = errorMessage.getText();
        String expectedMessage = "Wrong username or password. Try again. ";
        Thread.sleep(2000);
        driver.close();

    }

}
