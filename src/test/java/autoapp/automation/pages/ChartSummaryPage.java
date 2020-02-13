package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ChartSummaryPage extends BasePage {

    public ChartSummaryPage(BrowserDriver driver) {
        super(driver);
    }

    public static void checkProductName(String productName) {
        String actualString = driver.findElement(By.id(("layer_cart"))).findElement(By.className("product-name")).getText();
        Assert.assertEquals(actualString, productName);
    }

    public static void checkColor(String color) {
        String actualString = driver.findElement(By.id(("layer_cart_product_attributes"))).getText();
        Assert.assertThat(actualString, CoreMatchers.containsString(color));
    }

    public static void checkQuantity(String quantity) {
        String actualString = driver.findElement(By.id(("layer_cart_product_quantity"))).getText();
        Assert.assertEquals(actualString, quantity);
    }
}
