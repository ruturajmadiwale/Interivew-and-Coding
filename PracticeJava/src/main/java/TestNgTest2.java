import org.testng.annotations.Test;

public class TestNgTest2 {

    @Test(testName = "methodnew")
    public  void testNgTest2() {
        System.out.println("executing from class TestNgTest2");
    }

    @Test(dependsOnMethods = {"testNgTest2"})
    public void testNgTest1() {
        System.out.println("checking in the queue");
    }


}
