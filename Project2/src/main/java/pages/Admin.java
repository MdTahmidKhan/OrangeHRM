package pages;
import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class Admin {
    WebDriver driver = Browser.driver;

    @FindBy(css = "button[type='submit']") private WebElement submitButton;


    public Admin serachUserName(String userName) {
        List<WebElement> elements = driver.findElements(By.cssSelector(".oxd-input.oxd-input--active"));
        elements.get(1).sendKeys(userName);
        submitButton.click();
        return this;
    }

    public void validateUserName(String userName) {
        List<WebElement> elements = driver.findElements(By.className("oxd-table-cell"));
        Assert.assertEquals(elements.get(1).getText(), userName);
    }
}
