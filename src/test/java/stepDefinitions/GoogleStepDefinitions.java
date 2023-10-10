package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {

    GooglePage googlePage =new GooglePage(Driver.getDriver());
    @Given("Kullanici google a gider")
    public void kullaniciGoogleAGider() {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));

    }

    @When("togg için arama yapar")
    public void toggIcinAramaYapar() {
        googlePage.searchBox.sendKeys("Togg");
    }

    @Then("sonuclara togg oldugunu dogrular")
    public void sonuclaraToggOldugunuDogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("togg"));
    }

    @And("tarayıcıyı kapat")
    public void tarayıcıyıKapat() {
        Driver.closeDriver();
    }


}
