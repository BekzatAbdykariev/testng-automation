package utilities;

import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ApplicationFlow {

    private ApplicationFlow(){
    }

    public static void pauseFor(int milliseconds){
        try{
            Thread.sleep(milliseconds);
        }
        catch (InterruptedException e){
            System.out.println("Interruption happened! ");
        }
    }

    public static void scroll(int y){
        Actions actions = new Actions(Driver.browser());
        actions.scrollByAmount(0, y).perform();
    }

}
