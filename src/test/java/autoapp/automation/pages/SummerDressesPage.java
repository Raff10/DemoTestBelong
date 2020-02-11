package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import org.openqa.selenium.By;

public class SummerDressesPage extends BasePage {

    public SummerDressesPage(BrowserDriver driver) {
        super(driver);
    }

    public static void clickQuickView(String dressName) {
        driver.findElement(By.xpath("(//a[@class='product_img_link'][@title='"+dressName+"'])[1]")).click();
    }
}
