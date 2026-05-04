import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By usernameFieldLocator = By.id("user-name");
    private By passwordFieldLocator = By.id("password");
    private By loginButtonLocator = By.id("login-button");
    private By errorMessageLocator = By.xpath("//h3[@data-test='error']");

    private String baseUrl = "https://www.saucedemo.com/";

    public LoginPage(WebDriver driver) {
        super(driver);
        driver.get(baseUrl);
    }
    public void login(String username, String password) {
        getElement(usernameFieldLocator).sendKeys(username);
        getElement(passwordFieldLocator).sendKeys(password);
        getElement(loginButtonLocator).click();
    }
    public String getErrorMessage() {
        return getElement(errorMessageLocator).getText();
    }


}
