package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinations {
	
	
	@Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("Deciding the browser is open.");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
        System.out.println("Browser is triggered successfully.");
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
        System.out.println("Browser is Browser is started successfully.....");
    }
	
	 @Given("^User is on landing page$")
	    public void user_is_on_landing_page() throws Throwable {
	        System.out.println("Navigate to Login url: ");
	    }

	    @When("^User login into Application with username and password$")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
	        System.out.println("Logged in Successfuly");
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	        System.out.println("The homepage is populated: ");
	    }
	    
	    @When("^User login into Application with \"([^\"]*)\" username and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_username_and_password_something(String strArg1, String strArg2) throws Throwable {
	        System.out.println(strArg1);
	        System.out.println(strArg2);
	    }   

	    @Then("Cards are displayed {string}")
	    public void cards_are_displayed(String string) {
	        // Write code here that turns the phrase above into concrete actions
	        System.out.println(string);
	    }
	    
	    @Then("Cards are not displayed {string}")
	    public void cards_are_not_displayed(String string) {
	        // Write code here that turns the phrase above into concrete actions
	        System.out.println(string);
	    }
	    
	    @When("^User sign with following details$")
	    public void user_sign_with_following_details(DataTable data) throws Throwable {
	        List<List<String>> obj = data.asLists();
	        System.out.println(obj.get(0).get(0));
	        System.out.println(obj.get(0).get(1));
	        System.out.println(obj.get(0).get(2));
	        System.out.println(obj.get(0).get(3));
	        System.out.println(obj.get(0).get(4));
	    }
	    @When("^User login into application with (.+) and password (.+)$")
	    public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
	        System.out.println(username);
	        System.out.println(password);
	    }

}
