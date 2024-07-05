package uitest.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import uitest.BrowserInitialization;

public class HomePage extends BrowserInitialization {

    @FindBy(xpath="//textarea[@type='search']")
    @CacheLookup
    WebElement searchBox;


    public void navigateToSite(String url) {
        driver.navigate().to(url);
    }

    public  void enterTextInSearchBox(String text) {
        searchBox.sendKeys(text);
    }

    public void pressEnter() {
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).build().perform();

        Select s = new Select(searchBox);

    }
}
