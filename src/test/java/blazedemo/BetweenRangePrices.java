package blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;


public class BetweenRangePrices {

    static WebDriver driver;
    static List<WebElement> findFlightsBetweenPriceRange(double a, double b){
        String flightsXpath = "//tbody/tr";
        List<WebElement> searchedFlights = new ArrayList<WebElement>();
        List<WebElement> flights = driver.findElements(By.xpath(flightsXpath));
        String flightPriceXpath = "/td[6]";
        int index = 1;
        for(WebElement flight : flights) {
            WebElement flightPrice = driver.findElement(By.xpath(flightsXpath + "[" + index + "]" + flightPriceXpath));
            double price = Double.parseDouble(flightPrice.getText().substring(1));
            if(price >= a && price <= b){
                searchedFlights.add(flight);
            }
            index++;
        }
        return searchedFlights;
    }

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.blazedemo.com/reserve.php");
        List<WebElement> flights = findFlightsBetweenPriceRange(200, 300);
        for(WebElement flight : flights){
            System.out.println(flight.getText());
        }

    }
}



