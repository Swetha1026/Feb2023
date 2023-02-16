package Hooks;

import DriverFactory.DriverInitialisation;
import Utilities.ConfigReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;


import java.io.IOException;
import java.util.Properties;

public class ApplicationHooks {
    private DriverInitialisation dr;
    private ConfigReader cr;
    Properties p1;
    String browser;
    private WebDriver driver;


    @Before(order = 1)
    public void getProperty() throws IOException {
        cr=new ConfigReader();
        p1=cr.read_Properties();
        browser=p1.getProperty("browser");
    }
    @Before(order = 2)
    public void init_browser(){
        dr=new DriverInitialisation();
        driver=dr.init_driver(browser);
    }
    @After(order = 1)
    public void takeScreenShot(){
        System.out.println("Took screenshot");
    }
    @After(order = 0)
    public void quitBrowser(){
        driver.quit();
    }
}
