package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.UndefinedDataTableTypeException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CicekSepeti_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CicekSepetiStepDefinitions {
    CicekSepeti_Page CicekSepeti =new CicekSepeti_Page();

    @Given("{string} adresine gidilir")
    public void adresineGidilir(String string) {
        switch (string){
            case "cicek sepeti":
                Driver.getDriver().get(ConfigReader.getProperty("ciceksepeti"));
        }
    }

    @When("dogum gunu butonu tiklanir")
    public void dogumGunuButonuTiklanir() {
        CicekSepeti.homeGiris.click();
        CicekSepeti.dogumGunuButton.click();
    }

    @Then("dogum gunu sayfasinda oldugu dogrulanir")
    public void dogumGunuSayfasindaOlduguDogrulanir() {
        String expectedresult="https://www.ciceksepeti.com/dogum-gunu-hediyeleri";
        String actualResult = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedresult,actualResult);
    }

    @When("renk drop down tiklanir")
    public void renkDropDownTiklanir() {
        CicekSepeti.renkButton.click();
        CicekSepeti.allow.click();
    }

    @Then("sirasiyla renklerin secildiği dogrulanir")
    public void sirasiylaRenklerinSecildigiDogrulanir(DataTable dataTable) {

        List<String> bilgiler =dataTable.asList();
        for (int i =1 ; i<bilgiler.size() ; i++){
            switch (bilgiler.get(i)){
                case "bej":
                    CicekSepeti.bej.click();
                    ReusableMethods.wait(2);
                    break;

                case "beyaz":
                    CicekSepeti.beyaz.click();
                    ReusableMethods.wait(2);
                    break;

                case "cok renkli":
                    CicekSepeti.cokRenkli.click();
                    ReusableMethods.wait(2);
                    break;

                case "gri":
                    CicekSepeti.gri.click();
                    ReusableMethods.wait(2);
                    break;

                case "kahverengi":
                    CicekSepeti.kahverengi.click();
                    ReusableMethods.wait(2);
                    assertTrue(CicekSepeti.kahverengi.isSelected());
                    break;

                default:
                    break;

            }
            Driver.getDriver().get("https://www.ciceksepeti.com/dogum-gunu-hediyeleri");
            ReusableMethods.wait(2);
            CicekSepeti.renkButton.click();
        }

        Driver.closeDriver();
    }}