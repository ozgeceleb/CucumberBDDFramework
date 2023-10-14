package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BoynerPage {
    public BoynerPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='sc-fqkvVR byzlMQ icon-account']")
    public WebElement loginbutton;

    @FindBy (xpath = "//a[@class='user-cart-active_link__Y0FkN']")
    public WebElement signInButton;
    @FindBy (xpath = "//div[@class='login-desktop_leftHeaderRegisterDescription__TxkpZ']")
    public WebElement pageTitle;

    @FindBy (xpath = "//input[@placeholder='Adın Soyadın']")
    public WebElement nameSurname;

    @FindBy (xpath = "//input[@placeholder='Şifren']")
    public WebElement password;
    @FindBy (xpath = "//input[@placeholder='E-posta adresin']")
    public WebElement email;

    @FindBy (xpath = "//input[@placeholder='Cep Telefonun']")
    public WebElement cellphone;

    @FindBy(xpath = "(//div[@class='checkbox_box__1NS2V'])[1]")
    public WebElement consentText1;

    @FindBy(xpath = "(//div[@class='checkbox_box__1NS2V'])[2]")
    public WebElement consentText2;


    @FindBy(xpath = "//button[@class='login-button_box__dnyuU register-form_registerSubmitButton__Aztsg']")
    public WebElement SignInButton;
    }

