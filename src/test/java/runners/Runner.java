package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//raporlarin daha ikunakli olmasi icin

        },
        monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin
        features = "src\\test\\resources\\features\\ilkdeneme.feature",//features folder path
        glue = {"stepDefinitions"}  //stepdefinitions path
)
public class Runner {
}
