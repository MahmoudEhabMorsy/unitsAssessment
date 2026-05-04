import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_01 extends BaseTest{
    public String standardUserUserName = "standard_user";
    public String passwordForAllUsers = "secret_sauce";
    public String lockedOutUserUserName = "locked_out_user";
    public String problemUserUserName = "problem_user";
    public String errorUserUserName = "error_user";
    public String visualUserUserName = "visual_user";
    public String invalidUserUserName = "invalid_user";
    public String invalidPassword = "invalid_password";

     @Test(priority = 1,description = "Verify that standard_user can successfully log in and is redirected to the products page")
    public void verifyLoginWithStandardUser() {
        softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(standardUserUserName, passwordForAllUsers);
        ProductsPage productsPage = new ProductsPage(driver);
        softAssert.assertEquals(productsPage.getPageUrl(), "https://www.saucedemo.com/inventory.html", "URL does not match expected URL after login with standard_user");
        softAssert.assertAll();
     }
     @Test(priority = 2,description = "Verify that locked_out_user cannot log in and receives an appropriate error message.")
    public void verifyLoginWithLockedOutUser() {
        softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(lockedOutUserUserName, passwordForAllUsers);
        softAssert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Sorry, this user has been locked out.", "Error message does not match expected message for locked_out_user");
        softAssert.assertAll();
     }
     @Test(priority = 3,description = "Verify problem_user credentials can successfully log in and is redirected to the products page")
    public void verifyLoginWithProblemUser() {
        softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(problemUserUserName, passwordForAllUsers);
         ProductsPage productsPage = new ProductsPage(driver);
         softAssert.assertEquals(productsPage.getPageUrl(), "https://www.saucedemo.com/inventory.html", "URL does not match expected URL after login with problem_user");
         softAssert.assertAll();
     }
     @Test(priority = 4,description = "Verify error_user can successfully log in and is redirected to the products page")
    public void verifyLoginWithErrorUser() {
        softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(errorUserUserName, passwordForAllUsers);
         ProductsPage productsPage = new ProductsPage(driver);
         softAssert.assertEquals(productsPage.getPageUrl(), "https://www.saucedemo.com/inventory.html", "URL does not match expected URL after login with error_user");
         softAssert.assertAll();
     }
     @Test(priority = 5,description = "Verify visual_user can successfully log in and is redirected to the products page")
    public void verifyLoginWithVisualUser() {
        softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(visualUserUserName, passwordForAllUsers);
         ProductsPage productsPage = new ProductsPage(driver);
         softAssert.assertEquals(productsPage.getPageUrl(), "https://www.saucedemo.com/inventory.html", "URL does not match expected URL after login with visual_user");
         softAssert.assertAll();
     }
     @Test(priority = 6,description = "Verify that user cannot log in with empty username and password fields and receives appropriate error message")
    public void verifyLoginWithEmptyUsernameAndPasswordFields() {
        softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("", "");
         softAssert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username is required", "Error message does not match expected message");
         softAssert.assertAll();
    }
    @Test(priority = 7,description = "Verify that user cannot log in with valid username and empty password field and receives appropriate error message")
    public void verifyLoginWithEmptyPassword() {
        softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(standardUserUserName, "");
        softAssert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Password is required", "Error message does not match expected message");
        softAssert.assertAll();
    }
    @Test(priority = 8,description = "Verify that user cannot log in with invalid username and password and receives appropriate error message")
    public void verifyLoginWithInvalidUsernameAndPassword() {
        softAssert = new SoftAssert();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(invalidUserUserName, invalidPassword);
        softAssert.assertEquals(loginPage.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service", "Error message does not match expected message");
        softAssert.assertAll();
     }
}
