import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

public class DataTest {
    @DataProvider(name = "credentialsProvider")
    public Object[][] credentialsProvider() throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook(new File("C:\\Users\\madiw\\Documents\\Rutu\\Projects\\AutomationProjects\\Q2InterviewTest\\src\\main\\resources\\test.xlsx"));
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int rows = sheet.getLastRowNum();
        Object[][] data = new Object[rows][2];

        for (int i = 1; i <= rows; i++) {
            XSSFRow row = sheet.getRow(i);
            data[i - 1][0] = row.getCell(0).getStringCellValue(); // Username
            data[i - 1][1] = row.getCell(1).getStringCellValue(); // Password
        }

        workbook.close();
        return data;
    }

    @Test(dataProvider = "credentialsProvider")
    public void runAllTheTest(String username, String password) {
        testMethod1login(username, password);
        testMethod2verify(username, password);
        testMethod3logout(username, password);
    }

    public void testMethod1login(String username, String password) {
        // Your test method 1 logic using username and password
        System.out.println("Running testMethod1 with Username: " + username + " and Password: " + password);
    }


    public void testMethod2verify(String username, String password) {
        // Your test method 2 logic using username and password
        System.out.println("Running testMethod2 with Username: " + username + " and Password: " + password);
    }

    public void testMethod3logout(String username, String password) {
        // Your test method 3 logic using username and password
        System.out.println("Running testMethod3 with Username: " + username + " and Password: " + password);
    }

}
