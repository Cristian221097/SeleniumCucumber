package steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given("^I am on the Google search page$")
    public void navigateToGoogle() {
        google.navigateToGoogle();

    }

    @When("^I enter a search criteria$")
    public void enterSearchCriteria() {
        google.enterSearchCriteria("google");
    }

    @And("^click on the search button$")
    public void clickSearchButton() {
        google.clickGoogleSearch();
    }

    @Then("^the results match the criteria$")
    public void validateResults() {
        Assert.assertEquals("Google", google.firstResult());
    }

}
