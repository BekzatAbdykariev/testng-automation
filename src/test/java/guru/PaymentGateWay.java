package guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaymentGateWay {

    public void buy(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/payment-gateway/process_purchasetoy.php");
        WebElement generateCardNumber = driver.findElement(By.linkText("cardnumber.php"));


        /*
        Card Number:- 4399774782959366
        CVV:- 445
        Exp:- 12/2027
        Credit Limit $100.00
         */
    }


}
