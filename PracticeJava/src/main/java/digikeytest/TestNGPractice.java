package digikeytest;

import org.testng.annotations.*;

public class TestNGPractice {

    @BeforeTest
    public  void beforeTest() {
        System.out.println("Before test method");
    }
    @BeforeClass
    public  void beforeClass() {
        System.out.println("Before class method");
    }
    @BeforeMethod
    public  void  beforeMethod() {
        System.out.println("Before method");
    }
    @Test(groups = {"regression"})
    public  void  test1() {
        System.out.println("Test1");
    }

 /*   @Test(dataProvider = "dataPass")
    public  void  test2(String UN) {
        System.out.println("Test2");
        System.out.println(UN);
    }*/

 /*   @Test(invocationCount = 2)
    public  void invocationTest() {
        System.out.println("invocation test");
    }*/


    @Test
    @Parameters({"browser"})
    public void  paramTest(String browser) {
        System.out.println(browser);
    }
    @AfterMethod
    public  void  afterMethod() {
        System.out.println("After method");
    }
    @AfterClass
    public  void  afterClass() {
        System.out.println("After Class");
    }
    @AfterTest
    public  void  afterTest() {
        System.out.println("After test");
    }

    @DataProvider
    public  Object[][] dataPass() {
        Object[][] obj = new Object[2][1];
        obj[0][0] = "Hi";
        obj[1][0] = "hello";
        return  obj;
    }

}
