package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        String title = driver.getTitle();
        if(title.equals("Hi, Google!")){
            System.out.println("TEST PASSED ...");
        }
        else{
            System.out.println("TEST FAILED ...");
        }
        driver.navigate().to("https://amazon.com");
        title = (driver.getTitle());
        if(title.equals("Hey, Amazon!")){
            System.out.println("TEST PASSED ...");
        }
        else{
            System.out.println("TEST FAILED ...");
        }
        driver.navigate().back();
        driver.close();
        driver.quit();

    }

}
