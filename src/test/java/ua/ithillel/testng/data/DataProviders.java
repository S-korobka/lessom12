package ua.ithillel.testng.data;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider
    public static Object[][] myDataProvider() {
        return new Object[][] {
                {"test", 1},
                {"test", 2}
        };
    }
}
