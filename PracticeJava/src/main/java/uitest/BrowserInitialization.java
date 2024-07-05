package uitest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.*;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class BrowserInitialization {

    public static WebDriver driver;

    @BeforeTest
    public void browserInitialization() {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    public void testGoogleSearch() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//textarea[@type='search']"));
        element.sendKeys("positivity");
        Actions act = new Actions(driver);
        act.contextClick(element);
        Thread.sleep(5000);
        act.sendKeys(Keys.ENTER).build().perform();
        //driver.getScreenshotAs(OutputType.FILE);
    }

    public void waitTest() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("")));

        Wait wait2 = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2));
        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("")));

        WebElement ele = driver.findElement(By.id(""));

        String s="abc";
        driver.findElement(By.id("")).sendKeys(s);
        Actions act = new Actions(driver);
        act.moveToElement(ele);
        act.click();
        act.keyDown(Keys.SHIFT).sendKeys("value").build().perform();

        String mainWindow = driver.getWindowHandle();
        Set<String> window =driver.getWindowHandles();
        List<String> ls = new ArrayList<String>();
        ls.addAll(window);
        Iterator<String> it = window.iterator();
        while (it.hasNext()) {
            String childWindow = it.next();
            if(!mainWindow.equalsIgnoreCase(childWindow)) {
                driver.switchTo().window(childWindow);
            }
        }

        Select ss = new Select(ele);
       // ss.
        //Actions act = new Actions(driver);


        //driver.findElement(By.partialLinkText("test_"));
        //<htmltag>[contains(text(),'')]

        //SoftAssert ass = new SoftAssert();

    }


    //@AfterTest
    public void closeBrowser() {
        driver.quit();
    }



    public void printDataFromFile(File f) throws IOException {
        FileReader fr = new FileReader(f);
        int i = fr.read();
        while (i !=-1) {
            System.out.print((char)i);
            i = fr.read();
        }
    }

    public void test1() throws IOException {
        File f = new File("C:\\Users\\madiw\\Documents\\Rutu\\study\\test.txt");

        System.out.println("Before write the value:");
        this.printDataFromFile(f);

        FileWriter fw = new FileWriter(f);
        fw.write("will it overrider or not, let's see");
        fw.flush();
        fw.close();

        System.out.println("After write the value:");

        this.printDataFromFile(f);

        int a =10;
        long l = a;

        long  b = 10;
        int z = (int)b;
    }

    public void test2() {
        driver = new ChromeDriver();
       Set<String> windows = driver.getWindowHandles();
       Iterator<String> it = windows.iterator();
       String mainWindow = driver.getWindowHandle();
       while (it.hasNext()) {
          //String curentWindow = driver.getWindowHandle();
           String childWindow = it.next();
           if(!mainWindow.equalsIgnoreCase(childWindow))
               driver.switchTo().window(childWindow);
       }
    }

    //@Test
    public void testDynamicTable() {

        List<WebElement> elementList = driver.findElements(By.xpath("//h3[contains(text(),'Tasks')]//parent::div//parent::div//table//tbody//tr"));
        List<String> list = new ArrayList<String>();
        Set<String> set = new HashSet<String>();
        for(int i=1; i<=elementList.size(); i++) {
            WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'Tasks')]//parent::div//parent::div//table//tbody//tr["+i+"]//td[4]"));
            set.add(element.getText());
            list.add(element.getText());
        }
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            int count=0;
            String status = itr.next();
            for(int j=0;j< list.size();j++) {
                if(status.equalsIgnoreCase(list.get(j))) {
                    count++;
                }
            }
            System.out.println(status+":"+count);
        }
        //System.out.println(list);
        //System.out.println("set start");
        //System.out.println(set);
    }


    @Test
    public  void clickSignIn() throws InterruptedException {
        Thread.sleep(2000);
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]")));
        act.build().perform();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@rel='nofollow']//span[contains(text(),'Sign in')]")).click();


    }


}
