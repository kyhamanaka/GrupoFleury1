package pageObject;

import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Framework;

public class testPageObject {

    @FindBy(css = "div.boxcomponentstyle__Item-sc-43ermp-1:nth-child(16) > a:nth-child(1) > div:nth-child(1)")
    WebElement clickUnidades;

    @FindBy(css = "html body div#___gatsby div#gatsby-focus-wrapper div.client-doctor-headercomponentstyle__DesktopBottomHeaderStyled-owoxoj-2.FjEqa div.sc-bdVaJa.gridcomponent__GridStyled-sc-8zg10d-0.fHFDYJ div.sc-bwzfXH.gridcomponent__RowStyled-sc-8zg10d-1.kWuUKc div.sc-htpNat.gridcomponent__ColStyled-sc-8zg10d-2.kiDcuM div.boxcomponentstyle__HboxStyled-sc-43ermp-0.fUFmtv div.boxcomponentstyle__Item-sc-43ermp-1.hhcXYp a#button-title-desktop-header.buttoncomponentstyle__LinkButtonStyled-sc-11us3l0-2.jSPngX.unidades.active div.buttoncomponentstyle__ButtonContentStyled-sc-11us3l0-3.bTUJDG")
    WebElement textUnidades;

    @FindBy(css = ".checkbox-selectcomponentstyle__CheckboxSelectPlaceholderStyled-sc-7ktrvg-2")
    WebElement filtrofacilidade;

    @FindBy(css = ".typographycomponentstyle__InputLabel-sc-1oox73n-11")
    WebElement textFacilidade;

    WebDriver webDriver;
    WebDriverWait wait;
    Framework frame;

    public testPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
        webDriver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public void clickUnidades() {
        wait.until(ExpectedConditions.elementToBeClickable(clickUnidades)).click();
        Assert.assertEquals("Unidades", textUnidades.getText());
    }

    public void filtrofacilidade() {
        wait.until(ExpectedConditions.elementToBeClickable(filtrofacilidade)).click();
        Assert.assertEquals("Filtro por facilidade", textFacilidade.getText());

    }
}
