package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import cucumber.api.DataTable;
import java.util.List;
import java.util.Map;

public class InfoPage extends BasePage{

    public static String firstName_id = "customer_firstname";

    public InfoPage(BrowserDriver driver) {
        super(driver);
    }

    public static void enterPersonalInformation(DataTable dataTable) {
        List<Map<String, String>> signUpForms = dataTable.asMaps(String.class, String.class);
        String gender = signUpForms.get(0).get("Gender");
    }
}
