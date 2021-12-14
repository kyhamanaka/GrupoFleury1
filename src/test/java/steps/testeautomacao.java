package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.PageFactory;
import pageObject.testPageObject;
import util.Framework;

public class testeautomacao {

    testPageObject page;
    Framework frame;
    Scenario scenario;

    @Before
    public void before(Scenario sce) {
        scenario = sce;

    }

    @Given("que seja acessado o site de criação {string}")
    public void queSejaAcessadoOSiteDeCriação(String url) {
        page = PageFactory.initElements(Framework.browserDriver(url), testPageObject.class);
    }

    @When("for clicado no link {string} deve estar visivel")
    public void forClicadoNoLinkDeveEstarVisivel(String titlePage) {
        page.clickUnidades();
    }

    @When("clicar no filtro facilidades")
    public void clicarNoFiltroFacilidades() {
        page.filtrofacilidade();
    }

    @After
    public void after(Scenario scenario) {
//        frame = new Framework(scenario, Status.FAILED);
    }
}
