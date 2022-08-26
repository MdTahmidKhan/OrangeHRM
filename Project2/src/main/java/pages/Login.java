package pages;

import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    @FindBy(css = "input[name='username']") private WebElement userName;
    @FindBy(xpath = "//input[@name='password']") private WebElement password;
    @FindBy(className = "orangehrm-login-button") private WebElement loginButton;
    public PIM loginToPIMPage() {
        userName.sendKeys(Info.USER_NAME);
        password.sendKeys(Info.PASSWORD);
        loginButton.click();
        return PageFactory.initElements(Browser.driver, PIM.class);
    }
}
