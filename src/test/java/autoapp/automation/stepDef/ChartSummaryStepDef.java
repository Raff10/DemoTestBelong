package autoapp.automation.stepDef;

import autoapp.automation.pages.ChartSummaryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ChartSummaryStepDef {

    @Then("^validate the following product name on chart summary page \"([^\"]*)\"$")
    public void validateTheFollowingProductNameOnChartSummaryPage(String productName) throws Throwable {
        ChartSummaryPage.checkProductName(productName);
    }

    @And("^validate the following color on chart summary page \"([^\"]*)\"$")
    public void validateTheFollowingColorOnChartSummaryPage(String color) throws Throwable {
        ChartSummaryPage.checkColor(color);
    }

    @And("^validate the following quantity on chart summary page \"([^\"]*)\"$")
    public void validateTheFollowingQuantityOnChartSummaryPage(String quantity) throws Throwable {
        ChartSummaryPage.checkQuantity(quantity);
    }
}