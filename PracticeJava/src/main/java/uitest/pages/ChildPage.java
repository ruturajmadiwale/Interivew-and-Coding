package uitest.pages;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ChildPage extends ParentPage{

    @Test
    @Parameters({"browser"})
    public void child1Test(String value) {
        System.out.println("child 1 Test");
        System.out.println("name:"+value);
    }
}
