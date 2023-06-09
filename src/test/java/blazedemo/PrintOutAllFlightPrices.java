package blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintOutAllFlightPrices {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.blazedemo.com/reserve.php");
        List<WebElement> flightPrices = driver.findElements(By.xpath("//tr/td[6]"));
        for(WebElement price : flightPrices){
            System.out.println(price.getText().substring(1));
        }

    }
}
