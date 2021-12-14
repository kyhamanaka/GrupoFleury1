package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import util.Framework;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:cucumber/report.html"},
        features = {"features"},
        monochrome = true,
        glue = {"steps"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {

    @BeforeClass
    public static void init(){
        Framework.init();
    }
}
