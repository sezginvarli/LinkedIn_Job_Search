package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigReader;
import utilities.Driver;

public class Hooks {
    @Before
    public void setUp(){

    }
    public static RequestSpecification spec;
    @Before (value = "@Api")
    public  void baseUrlSetup(){
        spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();
    }
    @Before (order = 1,value = "@NewApplicant")
    public void navigateToRegistration(){

        Driver.getDriver().get(ConfigReader.getProperty("registration_page_url"));
    }

    @Before (order = 1,value = "@Signin")
    public void navigateToHomePage(){
        Driver.getDriver().get(ConfigReader.getProperty("base_url"));
    }


    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png","screenshots");
        }

    }
    @After            (value = "@Close")
    public void closeBrowser(){

        Driver.closeDriver();

    }
}
