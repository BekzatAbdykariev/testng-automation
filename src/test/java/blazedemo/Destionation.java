package blazedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Destionation {

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");

        WebElement dropDownLocation = driver.findElement(By.name("toPort"));
        Select dropDown = new Select(dropDownLocation);
        Thread.sleep(1000);
        dropDown.selectByValue("Berlin");

        WebElement selectedCity = dropDown.getFirstSelectedOption();

        if(selectedCity.getText().equals("Berlin")){
            System.out.println("Test passed....");
        }
        else{
            System.out.println("Test failed.....");
        }
    }
}
