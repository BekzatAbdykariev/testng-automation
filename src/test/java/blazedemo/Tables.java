package blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tables {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://blazedemo.com/reserve.php");


        List<WebElement> prices = driver.findElements(By.xpath("//tbody/tr/*[contains(text(), '$')]"));

        for(WebElement price : prices){
            System.out.println(price.getText().substring(1, price.getText().length()));
        }

    }


}
