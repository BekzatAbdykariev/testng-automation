package letskodeit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class OpenWindow {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
        WebElement openWindowButton = driver.findElement(By.xpath("//div//fieldset/button"));
        openWindowButton.click();
        WebElement anotherButton = driver.findElement(By.xpath("//li[4]"));
        anotherButton.click();

        /*
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);

        for(String id : windowHandles){
            driver.switchTo().window(id);
            if(!driver.getTitle().equals("All Corses")){
                driver.switchTo().window(id);
            }
            else{
                break;
            }
        }

        System.out.println(driver.getTitle());

         */

    }

}
