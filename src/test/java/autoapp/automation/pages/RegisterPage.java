package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class RegisterPage extends BasePage {

    public static String signIn_xpath = "//a[@title='Log in to your customer account']";
    public static String dresses_xpath = "(//a[@title='Dresses'])[2]";
    public static String summerDresses_xpath = "//div[@id='categories_block_left']/div/ul/li[3]";
    public static String email_id = "email_create";
    public static String createAccount_xpath = "//form[@id='create-account_form']//span[1]";

    public RegisterPage(BrowserDriver driver) {
        super(driver);
    }

    public static void openApplication() {
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    public static void clickSignIn() {
        driver.findElement(By.xpath(signIn_xpath)).click();
    }

    public static void clickDresses() {
        driver.findElement(By.xpath(dresses_xpath)).click();
    }

    public static void clickSummerDresses() {
        driver.findElement(By.xpath(summerDresses_xpath)).click();
    }

    public static void createAccount(String emailid) {
        emailid= emailid.replaceAll("Random", Integer.toString(generateRandomIntIntRange(00000, 99999)));
        driver.findElement(By.id(email_id)).sendKeys(emailid);
        driver.findElement(By.xpath(createAccount_xpath)).click();
    }

    public static void invalid_emailid(String emailid) {
        driver.findElement(By.id(email_id)).sendKeys(emailid);
        driver.findElement(By.xpath(createAccount_xpath)).click();
    }

    public static void checkMessage(String message) {
        String actualString = driver.findElement(By.id("create_account_error")).getText();
        Assert.assertEquals(actualString, message);
    }
}
