import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    protected WebDriver driver;
    protected SoftAssert softAssert;

    @BeforeMethod
    public void setUpBrowser() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        softAssert = new SoftAssert();
    }
    @AfterMethod
    public void tearDownBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
