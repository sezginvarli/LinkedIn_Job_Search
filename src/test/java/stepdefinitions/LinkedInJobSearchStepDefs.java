package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.SearchJobPage;

public class LinkedInJobSearchStepDefs {

    SearchJobPage searchJobPage = new SearchJobPage();

    @Given("user enters username")
    public void user_enters_username() throws InterruptedException {
        Thread.sleep(2000);
        searchJobPage.usernameBox.sendKeys("varlisezginn@gmail.com"); // config pro ile dynamic yapılacak

    }

    @When("user enters password")
    public void user_enters_password() throws InterruptedException {
        Thread.sleep(2000);
        searchJobPage.passwordBox.sendKeys("Sahin_24");// config pro ile dynamic yapılacak
        searchJobPage.signInButton.click();

    }

}
