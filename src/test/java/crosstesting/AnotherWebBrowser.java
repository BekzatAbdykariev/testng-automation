package crosstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AnotherWebBrowser {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.guru99.com");
        String firstPage = driver.getWindowHandle();
        driver.manage().window().maximize();
        WebElement inputBar = driver.findElement(By.xpath("//td/input[1]"));
        inputBar.sendKeys("safasfas@gmail.com" + Keys.ENTER);

        System.out.println("Username : " + driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]")).getText());
        System.out.println("Password : " + driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());

    }
}
