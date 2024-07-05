import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class IRCTCTest {

    ChromeDriver driver;

    @Test
    public  void  checkTatkalPresent() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\madiw\\Documents\\Software\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.findElement(By.xpath("//p-dropdown[@formcontrolname='journeyQuota']")).click();
       List<WebElement> dropdownElement = driver.findElements(By.xpath("//p-dropdown[@formcontrolname='journeyQuota']//div//div//ul//p-dropdownitem//li"));
       System.out.println(dropdownElement.size());
       boolean isTatkalPresent = false;
       for(WebElement ele: dropdownElement) {
           String journeyQuota = ele.getAttribute("aria-label").trim();
           System.out.println(journeyQuota);
           if(journeyQuota.equalsIgnoreCase("tatkal")) {
               isTatkalPresent = true;
               break;
           }
       }
        System.out.println("Tatkal Available or not:"+isTatkalPresent);
    }
}
