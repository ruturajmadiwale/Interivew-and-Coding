
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class DataProviderTest {

    private Object[][] testData;
@BeforeClass
public  void  setUp() throws IOException {
    testData=readTestDataFromExcel();
}

    @Test()
    public  void test1login() throws IOException {
    //readDataFromExcel();
        for (Object[] credentials : testData) {
            String username = (String) credentials[0];
            String password = (String) credentials[1];
            System.out.println("Running testMethod1 with Username: " + username + " and Password: " + password);
            // Your test logic for method 1
        }
    }

    @Test
    public  void test2verify() {
        for (Object[] credentials : testData) {
            String username = (String) credentials[0];
            String password = (String) credentials[1];
            System.out.println("Running testMethod2 with Username: " + username + " and Password: " + password);
            // Your test logic for method 1
        }
    }

    @Test
    public  void  test3logout() {
        for (Object[] credentials : testData) {
            String username = (String) credentials[0];
            String password = (String) credentials[1];
            System.out.println("Running testMethod3 with Username: " + username + " and Password: " + password);
            // Your test logic for method 1
        }
    }

    //@DataProvider
    public Object[][] readTestDataFromExcel() throws IOException {
        File f = new File("C:\\Users\\madiw\\Documents\\Rutu\\Projects\\AutomationProjects\\Q2InterviewTest\\src\\main\\resources\\test.xlsx");
        FileInputStream fi = new FileInputStream(f);
        XSSFWorkbook hs = new XSSFWorkbook(fi);
        XSSFSheet sheet = hs.getSheet("Sheet1");
        String UN=null; String pwd = null;

        Object[][] data = new Object[2][2];
        for(int i=0; i<2; i++) {
            XSSFRow row1 = sheet.getRow(i+1);

            data[i][0] = row1.getCell(0).getStringCellValue();
            data[i][1] = row1.getCell(1).getStringCellValue();
            //System.out.print("UN:"+UN+"  pwd:"+pwd);
            //System.out.println();

        }

        return data;
    }
}
