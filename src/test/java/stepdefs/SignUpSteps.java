package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;

public class SignUpSteps {
    LoginPage loginPage = new LoginPage();
    SignUpFirstPage signUpFirstPage = new SignUpFirstPage();
    SignUpSecondPage signUpSecondPage = new SignUpSecondPage();
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Given("verify user is on login page")
    public void verify_user_is_on_login_page() {
        loginPage.verifyLoginPage();

    }

    @When("user clicks on Sign Up Here link")
    public void user_clicks_on_sign_up_here_link() {
        loginPage.clickSignUpHereBtn();

    }

    @Then("verify user on signup first page")
    public void verify_user_on_signup_first_page() {
        signUpFirstPage.verifySignUp1();
    }

    @When("user fills out all required fields")
    public void user_fills_out_all_required_fields() {
        signUpFirstPage.enterData1();
    }

    @When("user click on Next button")
    public void user_click_on_next_button() {
        signUpFirstPage.clickNextBtn();
    }

    @Then("verify user on signup second page")
    public void verify_user_on_signup_second_page() {
        signUpSecondPage.verifySignUp2();
    }

    @When("user fills out all required fields on second page")
    public void user_fills_out_all_required_fields_on_second_page() {
        signUpSecondPage.enterData2();
    }


    @When("user click on Register button")
    public void user_click_on_register_button() {
        signUpSecondPage.clickRegisterBtn();
    }

    @Then("verify user can see Registration Successful message")
    public void verify_user_see_registration_successful_message() {
        registerPage.verifySuccessMessage();
    }

    @When("user enter valid password")
    public void user_enter_valid_password() {
        registerPage.enterValidPassword();
    }

    @Then("verify user on Home Page")
    public void verify_user_on_home_page() {
        homePage.verifyPage();
    }

}
