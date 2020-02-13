package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuickViewPage extends BasePage {

    public static String addToCart_id = "add_to_cart";
    public static String colourBlueBox_id = "color_14";

    public QuickViewPage(BrowserDriver driver) {
        super(driver);
    }

        public static void clickColor(String color) {
        //Choose color
            if (color.equalsIgnoreCase("BLUE")) {
                WebDriver frame = driver.switchTo().frame(driver.findElement(By.className("fancybox-iframe")));
                frame.findElement(By.id(colourBlueBox_id)).click();
                driver.switchTo().defaultContent();
            }
            else {
                System.out.println("Colour is not blue");
            }
        }

        public static void clickAddToCart() {
            //Click Add to cart button
            WebDriver frame = driver.switchTo().frame(driver.findElement(By.className("fancybox-iframe")));
            frame.findElement(By.id(addToCart_id)).click();
            driver.switchTo().defaultContent();
        }
    }



