import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2 {

    @BeforeMethod
    public void initiateMethod() {
        System.out.println("Initiating test of method...");
    }

    @AfterMethod
    public void closingMethod() {
        System.out.println("Closing test of method...");
    }

    @Test(priority=3, groups = {"Group A"}, dependsOnMethods = {"calculatorTest"})
    public void n() {
        System.out.println("Hi");
    }

    @Test(priority=1, groups = {"Group A", "Group B"})
    public void calculatorTest() {
        Calculator calculatorTest = new Calculator();
        Assert.assertEquals((calculatorTest.calculator(3,4)), 4);


    }
}
