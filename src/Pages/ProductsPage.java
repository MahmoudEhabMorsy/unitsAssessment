import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {
   private By productsInventoryListLocator = By.className("inventory_item");
    private By addToCartTextLocator = By.xpath(".//button[contains(text(),'Add to cart')]");
    private By cartButtonLocator = By.id("shopping_cart_container");
    private By productPriceLocator = By.xpath(".//div[@class='inventory_item_price']");
    private double productsPrice=0.0;
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public String addProductToCart(int productNumber){
        List<WebElement> productsList = getElements(productsInventoryListLocator);
        if(productNumber>productsList.size()){
            productNumber = productsList.size();
        }if(productNumber<1){
            productNumber = 1;
        }
            productsList.get(productNumber-1).findElement(addToCartTextLocator).click();
            productsPrice+= Double.parseDouble(getProductPrice(productNumber).split("\\$")[1]);
            return productsPrice + "";
    }
    public void goToCart(){
        getElement(cartButtonLocator).click();
    }
    private String getProductPrice(int productNumber){
        List<WebElement> productsList = getElements(productsInventoryListLocator);
        return productsList.get(productNumber-1).findElement(productPriceLocator).getText();
    }
    public String getPageUrl(){
        return driver.getCurrentUrl();
    }
}
