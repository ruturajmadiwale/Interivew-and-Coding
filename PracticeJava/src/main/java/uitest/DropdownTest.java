package uitest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DropdownTest {

    public static WebDriver driver;

    //@Test
    public void selectDropDownValue() {
        WebElement element = driver.findElement(By.xpath("//select"));

        Select s = new Select(element);
        //s.selectByVisibleText("Highest to lowest");
        s.selectByValue("lowestprice");
       // s.selectByIndex(0);
//        Actions act = new Actions(driver);
//        act.click(element);
//        act.sendKeys(Keys.ARROW_DOWN);
//        act.sendKeys(Keys.ARROW_DOWN);
//        act.sendKeys(Keys.ENTER);
//        act.build().perform();
    }

    //@Test
    public void takeScreenshot() throws IOException {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("./screenshot/result.jpg");
        FileUtils.copyFile(srcFile,destFile);
    }

    //@Test
    public void findElement() {
        String text = "text";
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='"+text+"']")).sendKeys("TV");
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).build().perform();
    }

    @Test
    public void testMouseHover() {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://codebyte.com");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("mainButtonElement"))).build().perform();
    }

    public void testTry() {

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();

        WebElement ele = driver.findElement(By.xpath(""));
        List<String> values = new ArrayList<String>();

        fetchOptions(ele,values);

        String parentWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("")).click();
        Set<String> windows = driver.getWindowHandles();

        Iterator<String> it = windows.iterator();
        while (it.hasNext()) {
            String childWindow = it.next();
            if(!parentWindow.equalsIgnoreCase(childWindow)) {
                driver.switchTo().window(childWindow);
            }
        }

        WebElement ele1 = driver.findElement(By.xpath(""));
        List<String> values1 = new ArrayList<String>();
        fetchOptions(ele1,values1);
        for(int i=0; i<values.size(); i++) {
            for (int j=0; j< values1.size(); j++) {
                if(values.get(i).equalsIgnoreCase(values1.get(j)))
                    System.out.print(values.get(i));
            }
        }

    }

    public void fetchOptions(WebElement ele, List<String> values) {
        Select sel = new Select(ele);
        List<WebElement> list = sel.getOptions();
        for(WebElement val: list) {
            values.add(val.getText());
        }
    }

    @Test(dependsOnMethods = {})
    @Parameters({"browser","val"})
    public void handlingFrames() {
        driver.manage().window().maximize();
    }
}
