import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPageStepTwoPage extends BasePage{
    private By finishButtonLocator = By.id("finish");
    private By itemsTotalPriceLocator = By.className("summary_subtotal_label");
    public CheckoutPageStepTwoPage(WebDriver driver) {
        super(driver);
    }
    public void finishCheckout(){
        getElement(finishButtonLocator).click();
    }
    public String getItemsTotalPrice(){
        return getElement(itemsTotalPriceLocator).getText().split("\\$")[1];
    }
}
