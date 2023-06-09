package guru;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Guru99 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com");
        String firstPage = driver.getWindowHandle();
        driver.manage().window().maximize();
        WebElement inputBar = driver.findElement(By.xpath("//td/input[1]"));
        inputBar.sendKeys("safasfas@gmail.com" + Keys.ENTER);

        System.out.println("Username : " + driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]")).getText());
        System.out.println("Password : " + driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());

    }

}
