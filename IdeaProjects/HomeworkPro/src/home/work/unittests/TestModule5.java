package home.work.unittests;

import home.work.module5.MinMaxArrayElement;
import org.junit.Assert;
import org.junit.Test;

public class TestModule5 {

    public static void setUpClass()throws Exception{
        MinMaxArrayElement minMaxArrayElement = new MinMaxArrayElement();
    }
    @Test
    public void testMinMaxArrayElementMax()throws Exception{
        int[] myArray = {4,7,-4,0};
        final MinMaxArrayElement minMaxArrayElement = new MinMaxArrayElement();
        final int actualResult  = minMaxArrayElement.getMinOrMaxElement(MinMaxArrayElement.MinMax.MAX,myArray);
        Assert.assertEquals("Max value calculated incorrectly.", 7, actualResult);
    }
    @Test
    public void testMinMaxArrayElementMin()throws Exception{
        int[] myArray = {7,-3,4,1};
        final MinMaxArrayElement minMaxArrayElement = new MinMaxArrayElement();
        final int actualResult = minMaxArrayElement.getMinOrMaxElement(MinMaxArrayElement.MinMax.MIN,myArray);
        Assert.assertEquals("Min value calculated incorrrectly.",-3,actualResult);
    }
}
