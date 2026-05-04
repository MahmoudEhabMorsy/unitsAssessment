import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPageStepOnePage extends BasePage {
    private By firstNameFieldLocator = By.id("first-name");
    private By lastNameFieldLocator = By.id("last-name");
    private By postalCodeFieldLocator = By.id("postal-code");
    private By continueButtonLocator = By.id("continue");
    public CheckoutPageStepOnePage(WebDriver driver) {
        super(driver);
    }
    public void fillCheckoutForm(String firstName, String lastName, String postalCode){
        getElement(firstNameFieldLocator).sendKeys(firstName);
        getElement(lastNameFieldLocator).sendKeys(lastName);
        getElement(postalCodeFieldLocator).sendKeys(postalCode);
    }
    public void continueCheckout(){
        getElement(continueButtonLocator).click();
    }

}
