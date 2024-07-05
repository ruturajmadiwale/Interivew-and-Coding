package uitest;

import org.testng.annotations.*;

public class BaseClass1 {

    @BeforeSuite
    public  void beforeSuiteTest() {
        System.out.println("Before suite");
    }

    @AfterSuite
    public  void  afterSuite() {
        System.out.println("After suite");
    }

    @BeforeClass
    public  void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public  void  afterClass() {
        System.out.println("After Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

}
