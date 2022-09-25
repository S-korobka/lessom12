package ua.ithillel.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.ithillel.testng.retry.MyRetry;

public class RetryTest {

    @Test(retryAnalyzer = MyRetry.class)
    public void testRetry() {
        System.out.println("Hey this is test of retry");
        Assert.assertTrue(true);
    }

    @Test
    public void testRetryWithListener() {
        System.out.println("Hey this is test of retry");
        Assert.assertTrue(false);
    }
}
