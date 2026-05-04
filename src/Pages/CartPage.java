import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    private By checkoutButtonLocator = By.id("checkout");
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void goToCheckout(){
        getElement(checkoutButtonLocator).click();
    }


}
