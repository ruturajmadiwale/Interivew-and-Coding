package uitest.pages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class ParentPage {

    @BeforeTest
    public  void beforeTest() {
        System.out.println("Before Tests");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }
}
