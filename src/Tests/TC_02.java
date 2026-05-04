import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_02 extends BaseTest {
    public String standardUserUserName = "standard_user";
    public String passwordForAllUsers = "secret_sauce";
    public int firstProductToPurchaseIndex = 1;
    public int secondProductToPurchaseIndex = 2;
    public String firstName = "Mahmoud";
    public String lastName = "Ehab";
    public String postalCode = "44561";
    public String totalPriceBeforeCheckoutCompletionPage="0";
    public String totalPriceAtCheckoutCompletionPage="0";

    @Test(priority = 1)
    public void verifyOrderingSuccessfully(){
        softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(standardUserUserName, passwordForAllUsers);
        ProductsPage productsPage = new ProductsPage(driver);
        totalPriceBeforeCheckoutCompletionPage = productsPage.addProductToCart(firstProductToPurchaseIndex);
        totalPriceBeforeCheckoutCompletionPage = productsPage.addProductToCart(secondProductToPurchaseIndex);
        productsPage.goToCart();
        CartPage cartPage = new CartPage(driver);
        cartPage.goToCheckout();
        CheckoutPageStepOnePage checkoutPageStepOnePage = new CheckoutPageStepOnePage(driver);
        checkoutPageStepOnePage.fillCheckoutForm(firstName, lastName, postalCode);
        checkoutPageStepOnePage.continueCheckout();
        CheckoutPageStepTwoPage checkoutPageStepTwoPage = new CheckoutPageStepTwoPage(driver);
        totalPriceAtCheckoutCompletionPage = checkoutPageStepTwoPage.getItemsTotalPrice();
        // I made this a hard assert as it's not favorable to order if the prices are not equal
        Assert.assertEquals(totalPriceBeforeCheckoutCompletionPage, totalPriceAtCheckoutCompletionPage);
        checkoutPageStepTwoPage.finishCheckout();
        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);
        softAssert.assertEquals(checkoutCompletePage.getorderCompletionText(), "Thank you for your order!", "Checkout complete message does not match expected message");
        softAssert.assertAll();


    }
}
