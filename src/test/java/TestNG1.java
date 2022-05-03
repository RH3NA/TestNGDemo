import org.testng.annotations.Test;

public class TestNG1 {

    @Test(priority=2, groups = {"Group B"})
    public void hello() {
        System.out.println("Hello");
    }

    @Test(priority=2, groups = {"Group B"}, dependsOnMethods = {"hello"})
    public void hello2() {
        System.out.println("Hello");
    }
}
