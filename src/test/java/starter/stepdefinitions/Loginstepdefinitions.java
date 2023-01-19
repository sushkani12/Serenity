package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class Loginstepdefinitions {

    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("user in on login page")
    public void user_in_on_login_page() {
        loginPage.openApplicatipon();
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
    loginPage.enterUserName(string);
    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
    loginPage.enterPassword(string);
    loginPage.login();
    }
    @Then("user able to see homepage")
    public void user_able_to_see_homepage() {
        homePage.verifyHome();
    }

}
