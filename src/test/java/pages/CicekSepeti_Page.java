package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CicekSepeti_Page {

    public CicekSepeti_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href='/dogum-gunu-hediyeleri'])[1]")
    public WebElement dogumGunuButton;

    @FindBy(xpath = "(//a[@class='dropdown-toggle btn filter__button'])[4]")
    public WebElement renkButton;

    @FindBy(xpath = "//label[text()='Bej ']")
    public WebElement bej;

    @FindBy(xpath = "//label[text()='Beyaz ']")
    public WebElement beyaz;

    @FindBy(xpath = "//label[text()='Çok Renkli ']")
    public WebElement cokRenkli;

    @FindBy(xpath = "//label[text()='Gri ']")
    public WebElement gri;

    @FindBy(xpath = "//label[text()='Kahverengi ']")
    public WebElement kahverengi;

    @FindBy(xpath = "//img[@src='https://cdn03.ciceksepeti.com/Themes/Ciceksepeti/Assets/images/homepage-switch/homepage-switch-popup-option-extra-230530.png']")
    public  WebElement homeGiris;

    @FindBy(xpath = "//button[text()='İzin Ver']")
    public WebElement allow;




}
