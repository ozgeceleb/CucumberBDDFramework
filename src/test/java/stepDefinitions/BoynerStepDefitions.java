package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BoynerPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class BoynerStepDefitions {

    BoynerPage scenerioOutlinePages = new BoynerPage();

    @Given("Go to Boyner website")
    public void goToBoynerWebsite() {
        Driver.getDriver().get(ConfigReader.getProperty("boyner"));

    }

    @When("Go to the login button")
    public void goToTheLoginButton() {
        ReusableMethods.hover(scenerioOutlinePages.loginbutton);

    }
    @And("Click the login button")
    public void clickTheLoginButton() {
        scenerioOutlinePages.signInButton.click();
    }
    @Then("Verified that is the  membership page")
    public void verifiedThatIsTheMembershipPage() {
        Assert.assertTrue(scenerioOutlinePages.pageTitle.isDisplayed());

    }

    @And("entered the {string} at membership page in the name section")
    public void enteredTheAtMembershipPageInTheNameSection(String name) {
        scenerioOutlinePages.nameSurname.sendKeys(name);

    }


    @Then("entered the  email bolumune {string} at membership pagee in the email section")
    public void enteredTheEmailBolumuneAtMembershipPageeInTheEmailSection(String email) {
        scenerioOutlinePages.email.sendKeys(email);
    }

    @Then("enteredd the  {string} at membership page in the password section")
    public void entereddTheAtMembershipPageInThePasswordSection(String password) {
        scenerioOutlinePages.password.sendKeys(password);
    }

    @Then("entered the {string}  at membership page in the cellphone section")
    public void enteredTheAtMembershipPageInTheCellphoneSection(String cellphone) {
        scenerioOutlinePages.cellphone.click();
    }

    @Then("entered the  {string} at membership page in the membership text section")
    public void enteredTheAtMembershipPageInTheMembershipTextSection(String text) {
        scenerioOutlinePages.consentText1.click();

    }

    @Then("entered the  {string} at membership page in the consent text section")
    public void enteredTheAtMembershipPageInTheConsentTextSection(String text) {
        scenerioOutlinePages.consentText2.click();
    }

    @And("Click the sign up button")
    public void clickTheSignUpButton() {
        scenerioOutlinePages.SignInButton.click();

    }

    @Then("Assert that the don't membership")
    public void assertThatTheDonTMembership() {
        String expectedData= "https://www.boyner.com.tr/uyelik?type=uye-ol";
        String actualData= Driver.getDriver().getCurrentUrl();
        assertEquals(expectedData,actualData);
        Driver.closeDriver();

    }





}