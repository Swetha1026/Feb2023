package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    @FindBy(xpath = "//li[@id=\"scroller_kids\"]/a[text()='Kids']")
    private WebElement kidslink;

    @FindBy(xpath = "//*[@id=\"kids\"]/div/div/ul/li[1]/a")
    private WebElement JacketsLink;

    @FindBy(xpath = "//*[@id=\"react_0HMOFAUEBPT6A\"]/div/div[1]/div/div/h1")
    private WebElement resultsTitle;


    public  LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickKids(){
        kidslink.click();
    }
    public void clickJackets(){
        JacketsLink.click();
    }
    public String getHomeTitle(){
        return driver.getTitle();
    }

    public String getTitle(){
        return resultsTitle.getText();
    }
}
