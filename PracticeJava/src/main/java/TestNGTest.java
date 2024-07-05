import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TestNGTest {

    @BeforeSuite
    public void beforeSuiteTest() {
        System.out.println("Before suite executing");
    }

    @BeforeTest
    public void beforeTestTest() {
        System.out.println("Executing before test");
    }

    @BeforeClass
    public  void beforeClassTest() {
        System.out.println("Before class executing");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Executing before method");
    }

    @Test(invocationCount = 1, dataProvider = "testData",groups = {"sanity","Regression"})
    public void passTest(int val) {
        System.out.println("Test case is passing");
        System.out.println("value is:"+val);
    }

    @Test(groups = {"sanity"})
    @Parameters({"data"})
    public  void passTest2(@Optional("default") String data) {
        System.out.println("Test case is passing 2");
        System.out.println("value is:"+data);
    }

    @Test(groups = {"sanity","Regression"})
    public  void passTest3() {
        System.out.println("Test case is passing 3");
    }

    @Test(dependsOnMethods = {"passTest"}, groups = {"sanity"})
    public  void failTest() {
        System.out.println("The below assertion is a hard assertion" +
                " after assertion the code block will not execute");
        SoftAssert soft = new SoftAssert();
        soft.fail("softly failing");
    //Assert.fail("Test failed");
        System.out.println("Test case is failing 2");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Executing after method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Executing after class");
    }

    @AfterTest
    public  void afterTest() {
        System.out.println("executing after test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Executing after suite");
    }

    @DataProvider
    public Object[][] testData() {

        Object[][] testData = new Object[1][1];
        testData[0][0] = 2;

        return  testData;
    }

    @DataProvider(name = "myDataProvider")
    Object[][] datsets() {
        Object[][] test = new Object[1][1];
        test[0][0]="hi";

        return test;
    }

    @Test(dataProvider = "myDataProvider")
    public void testShots(String hi) {
int i =10;
Integer.toString(i);
String s="10";
Integer.valueOf(s);
    }


}
