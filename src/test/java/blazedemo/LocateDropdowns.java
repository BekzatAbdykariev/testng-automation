package blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LocateDropdowns {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com");
        driver.manage().window().maximize();

        WebElement departureDropdown = driver.findElement(By.name("fromPort"));
        WebElement destinationDropdown = driver.findElement(By.name("toPort"));

        Select departureCities = new Select(departureDropdown);
        Select destinationCities = new Select(destinationDropdown);

        // Means, I have full access to interact with these two dropdowns
        String destinationDefaultValue = destinationCities.getFirstSelectedOption().getText();
        String departureDefaultValue = departureCities.getFirstSelectedOption().getText();

        System.out.println(departureDefaultValue);
        System.out.println(destinationDefaultValue);
        String[] requiredCities = {"Paris", "Philadelphia", "Boston", "Portland", "San Diego", "Mexico City", "São Paolo"};

        List<WebElement> departureOptions = departureCities.getOptions();

        boolean testPassed = false;
        for (int i = 0; i < requiredCities.length; i++){
            if(requiredCities[i].equals(departureOptions.get(i).getText())){
                testPassed = true;
            }
            else{

                testPassed = false;
            }
        }

        if(testPassed == true){
            System.out.println("Test passed .....");
        }
        else{
            System.out.println("Test failed .....");
        }

        // Write a code that verifies that each city is coming from the requirement
    }

}
