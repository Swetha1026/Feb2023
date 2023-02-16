package DriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInitialisation {
    public static WebDriver driver;
    public WebDriver init_driver(String browser){

        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if(browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        else if(browser.equals("edge")){
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }
        else{
            System.out.println("Invalid browser");
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        return driver;

    }
    public static  WebDriver driverReturn(){
        return driver;
    }
}
