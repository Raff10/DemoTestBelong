package autoapp.automation.stepDef;

import autoapp.automation.pages.QuickViewPage;
import cucumber.api.java.en.And;

public class QuickViewStepDef {

    @And("^I click the color \"([^\"]*)\"$")
    public void iClickTheColor(String color) throws Throwable {
        QuickViewPage.clickColor(color);
        Thread.sleep(3000);
    }

    @And("^I add to cart$")
    public void iAddToCart() throws Throwable {
        QuickViewPage.clickAddToCart();
        Thread.sleep(3000);
    }
}
