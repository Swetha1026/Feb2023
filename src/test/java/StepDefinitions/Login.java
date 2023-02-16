package StepDefinitions;

import DriverFactory.DriverInitialisation;
import Pages.LoginPage;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Login {

    LoginPage lp=new LoginPage(DriverInitialisation.driverReturn());
    @Given("^user launches the application$")
    public void user_launches_the_application() throws Throwable {
     DriverInitialisation.driverReturn().get("https://www.mountainwarehouse.com/");
    }

    @When("^user gets the title of the homePage$")
    public void user_gets_the_title_of_the_homePage() throws Throwable {
        System.out.println(lp.getHomeTitle());
    }

    @Then("^user should get homepage title as \"(.*?)\"$")
    public void user_should_get_homepage_title_as(String expTitle) throws Throwable {
        Assert.assertEquals(expTitle,lp.getHomeTitle());

    }

    @When("^user mousehovers on kids$")
    public void user_mousehovers_on_kids() throws Throwable {
     lp.clickKids();
    }

    @When("^clicks on \"(.*?)\"$")
    public void clicks_on(String category) throws Throwable {
        lp.clickJackets();
    }

    @Then("^the search results titled as \"(.*?)\" should be displayed\\.$")
    public void the_search_results_titled_as_should_be_displayed(String expTitle) throws Throwable {
        Assert.assertEquals(expTitle,lp.getTitle());

    }

}
