package autoapp.automation.stepDef;

import autoapp.automation.pages.InfoPage;
import autoapp.automation.pages.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDef {
 
    @Given("^Automation practice application is opened$")
    public void automation_practice_application_is_opened() throws Throwable {
        RegisterPage.openApplication();
        Thread.sleep(5000);
        //Better to use a wait for element though so that it will only wait if it needs to
    }

    @When("^I click sign in$")
    public void i_click_sign_in() throws Throwable {
        RegisterPage.clickSignIn();
    }

    @When("^I click dresses$")
    public void i_click_dresses() throws Throwable {
        RegisterPage.clickDresses();
        Thread.sleep(5000);
    }

    @When("^I click summer dresses$")
    public void i_click_summer_dresses() throws Throwable {
        RegisterPage.clickSummerDresses();
        Thread.sleep(5000);
    }

    @And("^I create account with emailid \"([^\"]*)\"$")
    public void i_create_account_with_emailid(String emailId) throws Throwable {
        RegisterPage.createAccount(emailId);
        Thread.sleep(5000);
    }

    @When("^I enter invalid email id \"([^\"]*)\"$")
    public void i_enter_invalid_email_id(String emailId) throws Throwable {
        RegisterPage.invalid_emailid(emailId);
        Thread.sleep(5000);
    }

    @Then("^I should be able to register with my below details$")
    public void i_should_be_able_to_register_with_my_below_details(DataTable dataTable) throws Throwable {
        InfoPage.enterPersonalInformation(dataTable);
        Thread.sleep(5000);
    }

    @Then("^I should see the error \"([^\"]*)\"$")
    public void i_should_see_the_error(String errorMessage) throws Throwable {
        RegisterPage.checkMessage(errorMessage);
        Thread.sleep(5000);
    }
}
