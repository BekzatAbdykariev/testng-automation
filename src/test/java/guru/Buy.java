package guru;

import org.junit.Assert;
import java.util.Arrays;
import org.junit.Test;

public class Buy {

    public String getInitials(String fullName){
        fullName = fullName.trim();
        if (fullName.isEmpty()){
            return null;
        }
        String [] arr = fullName.split(" ");
        if (arr.length != 2){
            return null;
        }
//        ["James", "Bond"] => JB
        String initials = "" + arr[0].charAt(0) + arr[1].charAt(0);
        return initials.toUpperCase();
    }

    @Test
    public void test1(){
        String actualResult = getInitials("james  bond");
        Assert.assertEquals("JB", actualResult);
    }
    @Test
    public void test2(){
        String result = getInitials("James");
        Assert.assertNull(result);
    }
    @Test
    public void test3(){
        String result = getInitials("james bond");
        Assert.assertEquals("JB", result);
    }

}
