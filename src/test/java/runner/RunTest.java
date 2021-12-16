    package runner;


    import cucumber.api.CucumberOptions;
    import cucumber.api.junit.Cucumber;
    import org.junit.After;
    import org.junit.BeforeClass;
    import org.junit.runner.RunWith;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;


    @CucumberOptions(

            features ="src/test/resources",
            glue = {"steps"},
            tags = {"@cadastro_sucesso"}


    )
    @RunWith(Cucumber.class)
    public class RunTest {

        public static WebDriver driver;

        @BeforeClass
        public static void start(){
            driver = new ChromeDriver();
        }

        @After
        public static void stop(){
            driver.quit();
        }

    }
