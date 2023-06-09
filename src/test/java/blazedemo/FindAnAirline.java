package blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindAnAirline {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://blazedemo.com/reserve.php");
        printFlightInfo("436");

        /*
        for(WebElement tempFlightNumber : allFlightNumbers){
            String indexString = Integer.toString(index);
            String xpath = "//tbody/tr[" + indexString + "]/td[3]";
            WebElement flightNumber = driver.findElement(By.xpath(xpath));
            System.out.println(flightNumber.getText());
            index++;
        }

         */

    }

    static void printFlightInfo(String searchingFlightNumber){
        List<WebElement> allFlightNumbers = driver.findElements(By.xpath("(//tbody//tr/td[2])"));
        boolean flightNumberFound = false;
        int index = 1;
        for(WebElement tempFlightNumber : allFlightNumbers){
            if(tempFlightNumber.getText().equals(searchingFlightNumber)){
                flightNumberFound = true;
                String indexString = Integer.toString(index);
                String xpath = "//tbody/tr[" + indexString + "]/td[3]";
                WebElement flightNumber = driver.findElement(By.xpath(xpath));
                System.out.println(flightNumber.getText());
            }
            index++;
        }

        if(flightNumberFound == false) {
            System.out.println("There is no airline with the given flight number");
        }
    }

}
