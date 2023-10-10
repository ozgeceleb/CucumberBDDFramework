package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class GooglePage {
    private WebDriver driver;
    public GooglePage(WebDriver driver) {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));

        this.driver=driver;
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(xpath = "//*[@name='q']")
        public WebElement searchBox;
    }
