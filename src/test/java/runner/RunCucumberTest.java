package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json","html:target/reports/"},
        features = "classpath:features",
        tags = {"@teste-falha"},
        glue = {"steps"}
)
public class RunCucumberTest {
   public static WebDriver driver ;

    @BeforeClass
    public static void start() {
        System.out.println("iniciou");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void stop() {
        System.out.println("finalizou");
        driver.quit();
    }

}
