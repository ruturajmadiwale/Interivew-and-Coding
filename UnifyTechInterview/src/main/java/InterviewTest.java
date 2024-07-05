import org.jsoup.Jsoup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InterviewTest {
    WebDriver driver;
    @BeforeTest
    public void browserInitialization() {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.geeksforgeeks.org/move-zeroes-end-array/");
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void findTextFromWebPage() {

        String text = driver.findElement(By.xpath("//div[@class='code-output'][1]")).getText();
        WebElement element = driver.findElement(By.xpath("//div[@class='code-output'][1]"));
       // System.out.println("Text is:"+text);
        String result = Jsoup.parse(element.getAttribute("outerHTML")).selectFirst(element.getTagName()).ownText();
        System.out.println("result is:"+result);
    }

}
