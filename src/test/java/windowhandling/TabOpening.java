package windowhandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabOpening {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://amazon.com");

        System.out.println(driver.getCurrentUrl());
    }

}
