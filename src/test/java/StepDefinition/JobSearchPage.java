package StepDefinition;


import BasePage.BaseApp;
import TestPage.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class JobSearchPage extends BaseApp{
	
	public LoginPage Home;

    

    @Given("^I am a job seeker on the NHS Jobs website$")
    public void validateloginpage(String What, String Where) throws InterruptedException {
    	Home= new LoginPage();
    	Home.navigate_url(What,Where);
    	
      
    }

    @When("^I input my preferences into the Search functionality$")
    public void enter_usernameandpassword(String username, String password) throws Exception {
    	Home= new LoginPage();
    }

    @Then("^I should see a list of jobs matching my preferences$")
    public void Job_MatchingList() throws Exception {
    	Home= new LoginPage();

    }

    @And("^the search results should be sorted by the newest Date Posted$")
    public void verify_Search() throws Exception {
    	Home= new LoginPage();

    }

}
