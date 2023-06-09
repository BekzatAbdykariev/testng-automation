package guru;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AgileProjectPage;
import pages.GuruHomePage;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

import javax.swing.*;

public class AgileProject {


    @Test
    public void checkLogIn(){
        Driver.browser().get(Config.getValue("URL"));
        Driver.browser().findElement(By.linkText("Agile Project")).click();
        String userName = Driver.browser().findElement(By.xpath("//div/ol/li[1]")).getText().substring(9);
        String password = Driver.browser().findElement(By.xpath("//div/ol/li[2]")).getText().substring(11);
        Driver.browser().findElement(By.name("uid")).sendKeys(userName);
        Driver.browser().findElement(By.name("password")).sendKeys(password + Keys.ENTER);
        ApplicationFlow.pauseFor(500);
        String actualURL = Driver.browser().getCurrentUrl();
        Assert.assertEquals("https://demo.guru99.com/Agile_Project/Agi_V1/customer/Customerhomepage.php", actualURL);

    }

    @Test
    public void pomTest(){
        Driver.browser().get(Config.getValue("guruURL"));
        GuruHomePage guruHomePage = new GuruHomePage();
        AgileProjectPage agileProjectPage = new AgileProjectPage();
        ApplicationFlow.pauseFor(3000);
        guruHomePage.agileProjectLink.click();
        ApplicationFlow.pauseFor(5000);
        String userID = agileProjectPage.userIDAccess.getText().trim().substring(9);
        String password= agileProjectPage.passwordAccess.getText().trim().substring(11);
        agileProjectPage.userIDInput.sendKeys(userID);
        agileProjectPage.passwordInput.sendKeys(password);
        agileProjectPage.loginButton.click();
        ApplicationFlow.pauseFor(500);
        String expectedURL = "https://demo.guru99.com/Agile_Project/Agi_V1/customer/Customerhomepage.php";
        Assert.assertEquals("URL Failed", expectedURL, Driver.browser().getCurrentUrl());
    }

    @Test
    public void checkLogOut(){
        Driver.browser().get(Config.getValue("URL"));
        Driver.browser().findElement(By.linkText("Agile Project")).click();
        String userName = Driver.browser().findElement(By.xpath("//div/ol/li[1]")).getText().substring(9);
        String password = Driver.browser().findElement(By.xpath("//div/ol/li[2]")).getText().substring(11);
        Driver.browser().findElement(By.name("uid")).sendKeys(userName);
        Driver.browser().findElement(By.name("password")).sendKeys(password + Keys.ENTER);
        ApplicationFlow.pauseFor(500);
        Driver.browser().findElement(By.linkText("Log out")).click();
        ApplicationFlow.pauseFor(500);
        Alert alert = Driver.browser().switchTo().alert();
        alert.accept();
        String expectedUrlAfterLogOut = "https://demo.guru99.com/Agile_Project/Agi_V1/index.php";
        ApplicationFlow.pauseFor(500);
        Assert.assertEquals("Log out functionality", expectedUrlAfterLogOut, Driver.browser().getCurrentUrl());
    }
    @After
    public void cleanUp(){
        Driver.quit();
    }

}
