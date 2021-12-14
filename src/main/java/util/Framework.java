package util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Framework {
    static WebDriver driver;
    static ExtentReports extent;
    static ExtentTest logger;

//    public Framework(Scenario scenario, Status status){
//
//        if (scenario.isFailed()){
//            logger.fail("Status: " + status);
//        }
//        extent.flush();
//        driver.quit();
//    }

    public Framework(Scenario scenario){
        logger = extent.createTest(scenario.getName());

    }

    public static void init(){
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report\\extentReport.html");
        reporter.config().setDocumentTitle("Report");
        reporter.config().setReportName("Tests");
        reporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("System Operation", System.getProperty("os.name").toUpperCase());
        extent.setSystemInfo("System Operation", System.getProperty("user.name").toUpperCase());
    }

    public static WebDriver browserDriver(String url) {
        ChromeOptions options = new ChromeOptions();
        //opcao que nao abre o browser
//        options.setHeadless(true);
        driver = new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        return driver;
    }

    public void Test(String typeStep){
        logger.pass(typeStep);
    }
}
