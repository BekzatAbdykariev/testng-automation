package blazedemo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestingDestination {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.linkText("destination of the week! The Beach!"));
        element.click();
        List<WebElement> elements = driver.findElements(By.xpath("//h1/.."));
        System.out.println(elements.get(0));

        driver.quit();

    }

}
