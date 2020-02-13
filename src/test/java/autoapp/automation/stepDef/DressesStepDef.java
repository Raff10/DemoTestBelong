package autoapp.automation.stepDef;

import autoapp.automation.pages.SummerDressesPage;
import cucumber.api.java.en.And;

public class DressesStepDef {

    @And("^I click quick view for \"([^\"]*)\"$")
    public void iClickQuickViewFor(String dressName) throws Throwable {
        SummerDressesPage.clickQuickView(dressName);
        Thread.sleep(5000);
    }
}
