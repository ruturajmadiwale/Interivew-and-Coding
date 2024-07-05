import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class PracticeDataTest {

    public static   void getTestData() throws IOException, InvalidFormatException {
        XSSFWorkbook wb = new XSSFWorkbook(new File("C:\\Users\\madiw\\Documents\\Rutu\\Projects\\AutomationProjects\\Q2InterviewTest\\src\\main\\resources\\test.xlsx"));
        XSSFSheet sheet = wb.getSheet("Sheet1");
        int totalRows = sheet.getLastRowNum();
        for (int i=1; i<=totalRows; i++) {
            XSSFRow row = sheet.getRow(i);
            String un = row.getCell(0).getStringCellValue();
            String pwd = row.getCell(1).getStringCellValue();
            System.out.println(un+" "+pwd);
        }
    }

    public static void main(String[] args) throws IOException, InvalidFormatException {
        getTestData();
    }
}
