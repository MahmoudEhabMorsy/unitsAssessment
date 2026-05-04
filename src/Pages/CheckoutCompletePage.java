import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage extends BasePage {
    private By orderCompletionTextLocator = By.className("complete-header");
    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }
    public String getorderCompletionText(){
        return getElement(orderCompletionTextLocator).getText();
    }
}
