import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Login;

import java.time.Duration;

public class TestBase {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver =  Browser.getDriver();
        driver.navigate().to(Info.URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterMethod
    public void closeBrowser(){
        //driver.close();
        //driver.quit();
    }
    public Login startLoginPage(){
        return PageFactory.initElements(driver, Login.class);

    }
}
