package ua.ithillel.testng;
import org.testng.Assert;
import org.testng.annotations.*;

public class Test1 {
    @Test
    public void testOne() {
        System.out.println("Test One");
        Assert.assertTrue(true);
    }
}
