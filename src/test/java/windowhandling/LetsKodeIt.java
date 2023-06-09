package windowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class LetsKodeIt {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/");
        driver.manage().window().maximize();
        String currentPageID = driver.getWindowHandle();
        WebElement practiseButton = driver.findElement(By.className("dynamic-link"));
        practiseButton.click();

        Set<String> windowsTabsIDs = driver.getWindowHandles();

        for(String id : windowsTabsIDs){
            if(!id.equals(currentPageID)){
                driver.switchTo().window(id);
                break;
            }
        }

        Thread.sleep(2000);

        WebElement openTabElement = driver.findElement(By.xpath("//fieldset/a"));
        openTabElement.click();




    }
}
