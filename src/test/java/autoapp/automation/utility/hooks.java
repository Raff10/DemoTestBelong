package autoapp.automation.utility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.File;
import java.net.URL;

public class hooks {
    public static BrowserDriver driver;

    @Before
    public void setUp(){
        System.setProperty("browser","chrome");
        String browserName = getParameter("browser");
        System.out.println("driver "+ browserName +"");
        driver = new BrowserDriver(browserName);
    }

    @After
    public void tearDown(){
        driver.close();
    }

    private String getParameter(String name) {
        String value = System.getProperty(name);
        if (value == null)
            throw new RuntimeException(name + " is not a parameter!");

        if (value.isEmpty())
            throw new RuntimeException(name + " is empty!");

        return value;
    }


}
