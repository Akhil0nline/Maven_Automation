package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import BasePage.BaseApp;
import TestPage.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JobSearchPage extends BaseApp {

    public LoginPage Home;

    @Given("^I am a job seeker on the NHS Jobs website$")
    public void validateloginpage(String url, String path) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        DesiredCapabilities caps = new DesiredCapabilities();
        // Change resolution
        caps.setCapability("resolution", "1024x768");
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("^I input my preferences into the Search functionality$")
    public void enter_usernameandpassword(String What, String Where) throws Exception {
        Home = new LoginPage();
        
        Home.navigate_url(What, Where);
    }

    @Then("^I should see a list of jobs matching my preferences$")
    public void Job_MatchingList() throws Exception {
        Home = new LoginPage();

    }

    @And("^the search results should be sorted by the newest Date Posted$")
    public void verify_Search() throws Exception {
        Home = new LoginPage();

    }

}
