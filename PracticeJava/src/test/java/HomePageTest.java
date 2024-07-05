import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import uitest.BrowserInitialization;
import uitest.pages.HomePage;

public class HomePageTest extends BrowserInitialization {


    @Test
    public void testSerachText() {
        HomePage hp = new HomePage();
        PageFactory.initElements(driver, hp);

        hp.navigateToSite("https://www.google.com");
        hp.enterTextInSearchBox("How to be clam");
        hp.pressEnter();


    }
}
