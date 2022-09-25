package ua.ithillel.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ua.ithillel.testng.data.DataProviders;

public class DataProviderTest {

    @DataProvider
    public Object[][] createData() {
        return new Object[][]{
                {"Serhii", 29},
                {"Alex", 37},
        };
    }

    @Test(dataProvider = "createData")
    public void testData(String name, int age) {
        System.out.println(name + " " + age);
    }


}
