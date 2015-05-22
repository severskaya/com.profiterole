package com.profiterole.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import net.thucydides.core.annotations.Steps;
import com.profiterole.steps.ProfiteroleHomeSteps;

public class TestAboutUsButton {

    @Steps
    private ProfiteroleHomeSteps profiteroleSteps;

    @Given("the user is on Profiterole home page")
    public void givenUserIsOnProfiteroleHomePage(){
        profiteroleSteps.openPage();
    }

    @When("the user clicks on AboutUs Button")
    public void whenUserClickAboutUsButton(){
        profiteroleSteps.clickAboutUsButton();
    }

    @Then("the user should see page with words 'About Us'")
    public void thenUserIsOnAboutUsPage(){
        profiteroleSteps.assertThatAboutUsPageWasOpened();
    }
}
