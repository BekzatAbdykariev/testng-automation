package letskodeit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class OpenTabWindow {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/");
        WebElement practiceButton = driver.findElement(By.xpath("//div//li/a"));
        practiceButton.click();
        Set<String> allTabs = driver.getWindowHandles();
        for(String id: allTabs){
            if(!driver.getWindowHandle().equals(id)){
                driver.switchTo().window(id);
            }
        }
        WebElement tabButton = driver.findElement(By.xpath("//div//fieldset/a"));
        tabButton.click();
        Set<String> newTabs = driver.getWindowHandles();
        for(String id : newTabs){
            if(!allTabs.contains(id)){
                driver.switchTo().window(id);
            }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println();


        /*
        WebElement blogButton = driver.findElement(By.xpath("//li[5]/a"));
        blogButton.click();
        System.out.println("hello");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());


        Set<String> allTabs = driver.getWindowHandles();

        for(String id : allTabs){
            if(!driver.getTitle().equals("Practice Page")){
                driver.switchTo().window(id);
            }
        }
         */

    }

}
