package blazedemo;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateAFlightNumber {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/reserve.php");
        driver.manage().window().maximize();
        WebElement flightNumber = driver.findElement(By.xpath("//tbody/tr[3]/td[2]"));
        System.out.println(flightNumber.getText());
        System.out.println(flightNumber.getAttribute("id"));



    }

}
