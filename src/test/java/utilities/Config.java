package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public class Config {

    private static Properties properties;
    static {
        try{
            properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/configurations.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
        }
        catch(IOException e){
            System.out.println("File was not found. ");
        }
    }
    public static String getValue(String key){
        return properties.getProperty(key);
    }

}

