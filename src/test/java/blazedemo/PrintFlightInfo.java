package blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class PrintFlightInfo {

    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://blazedemo.com/reserve.php");
        printFlightInfo("4346");
    }

    static void printFlightInfo(String flightNumber){
        List<WebElement> allFlightNumbers = driver.findElements(By.xpath("//tbody/tr/td[2]"));
        String xpathOfTheFoundFlightNumber = "";
        boolean flightFound = false;

        for(WebElement flight : allFlightNumbers){
            if(flight.getText().equals(flightNumber)){
                xpathOfTheFoundFlightNumber = "//tbody/tr/td[.=" + flightNumber + "]";
                flightFound = true;
            }
        }

        if(flightFound == true){
            WebElement airline = driver.findElement(By.xpath(xpathOfTheFoundFlightNumber + "/../td[3]"));
            WebElement departure = driver.findElement(By.xpath(xpathOfTheFoundFlightNumber + "/../td[4]"));
            WebElement arrival = driver.findElement(By.xpath(xpathOfTheFoundFlightNumber + "/../td[5]"));
            WebElement price = driver.findElement(By.xpath(xpathOfTheFoundFlightNumber + "/../td[6]"));
            System.out.println(airline.getText());
            System.out.println(departure.getText());
            System.out.println(arrival.getText());
            System.out.println(price.getText());
        }
        else{
            System.out.println("There is no such flight. ");
        }
    }
}
