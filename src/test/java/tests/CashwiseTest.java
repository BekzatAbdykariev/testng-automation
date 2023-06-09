package tests;

import com.github.javafaker.App;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ApplicationFlow;

public class CashwiseTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://cashwise.us");
        driver.manage().window().maximize();
        ApplicationFlow.pauseFor(1000);
        if(driver.getTitle().equals("Cashwise is best!")){
            System.out.println("Title test has passed...");
        }
        else{
            System.out.println("Title test has failed...");
        }
        if(driver.getCurrentUrl().equals("https://cashwise.us/home")){
            System.out.println("Url test has passed...");
        }
        else{
            System.out.println("Url test has failed...");
        }
        System.out.println(driver.getPageSource());
        driver.close();


    }
}
