package ua.ithillel.testng.listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter {

    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);
        System.out.println("This is my custom listener and method was passed successfully: "
        + tr.getMethod());
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        super.onTestSkipped(tr);
    }
}
