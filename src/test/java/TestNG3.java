import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestNG3 implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test starting");
    }

    }

