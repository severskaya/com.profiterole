package com.profiterole.steps.jbehave;

import com.profiterole.steps.actions.LogInProfiteroleSteps;
import com.profiterole.steps.actions.ProfiteroleHomeSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class TestLogInPage {

    public static final String LOGIN = "sever";
    public static final String PASSWORD = "111111";

    @Steps
    private ProfiteroleHomeSteps profiteroleHomeSteps;

    @Steps
    private LogInProfiteroleSteps logInProfiteroleSteps;

    @Given("the user is on Profiterole home page")
    public void givenUserOnHomePage(){
        profiteroleHomeSteps.openPage();
    }

    @Given("the user clicks on Enter Button")
    public void givenUserClicksOnEnterButton(){
        profiteroleHomeSteps.clickEnterButton();
    }

    @When("the user enters Login")
    public void whenUserEntersLogin(){
        logInProfiteroleSteps.enterLoginIntoLoginField(LOGIN);
    }

    @When("the user enters Password")
    public void whenUserEntersPassword(){
        logInProfiteroleSteps.enterPasswordIntoPasswordField(PASSWORD);
    }

    @When("the user click on Enter Button in Entry Window")
    public void whenUserClicksEnterButton(){
        logInProfiteroleSteps.clickEnterButtonInEntryWindow();
    }

    @Then("the user should see the page with words 'Wellcome on our site'")
    public void thenUserShouldSeeWelcomeOnSitePage(){
        logInProfiteroleSteps.assertThatUserWasLogIn();
    }

}
