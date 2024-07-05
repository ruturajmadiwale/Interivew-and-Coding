package digikeytest.UITests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SeleniumTest {

    @Test
    public  void  test() throws AWTException {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

//        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
//        driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);

        Robot rb = new Robot();
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_T);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_T);

        //Actions act = new Actions(driver);

//        act.sendKeys(Keys.CONTROL);
//        act.sendKeys(Keys.chord("t"));
        //act.build().perform();
        driver.switchTo().defaultContent();
    }
}
