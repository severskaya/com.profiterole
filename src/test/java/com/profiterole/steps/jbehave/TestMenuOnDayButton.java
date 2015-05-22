package com.profiterole.steps.jbehave;


import com.profiterole.steps.actions.CreateMenuDropDownSteps;
import com.profiterole.steps.actions.ProfiteroleHomeSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class TestMenuOnDayButton {

    @Steps
    private ProfiteroleHomeSteps profiteroleHomeSteps;

    @Steps
    private CreateMenuDropDownSteps createMenuDropDownSteps;

    @Given("the user is on Profiterole home page")
    public void givenUserOnHomePage(){
        profiteroleHomeSteps.openPage();
    }

    @Given("the user clicks on Create Menu Button")
    public void givenUserClicksCreateMenuButton(){
        profiteroleHomeSteps.clickCreateMenuButton();
    }

    @When("the user clicks on Menu on a Day Button")
    public void whenClicksmenuOnADayButton(){
        createMenuDropDownSteps.clickMenuOnADayButton();
    }

    @Then("the user should see the page with three choices 'Breakfast', 'Dinner' and 'Supper'")
    public void thenShouldSeeBreakfastDinnerSupperPage(){
        createMenuDropDownSteps.assertThatCreateMenuOnADayPageIsVisible();
    }

}
