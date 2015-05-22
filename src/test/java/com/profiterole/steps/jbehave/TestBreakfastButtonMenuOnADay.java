package com.profiterole.steps.jbehave;

import com.profiterole.steps.actions.CreateMenuDropDownSteps;
import com.profiterole.steps.actions.MenuOnADaySteps;
import com.profiterole.steps.actions.ProfiteroleHomeSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class TestBreakfastButtonMenuOnADay {

    @Steps
    private ProfiteroleHomeSteps profiteroleHomeSteps;

    @Steps
    private CreateMenuDropDownSteps createMenuDropDownSteps;

    @Steps
    private MenuOnADaySteps menuOnADaySteps;

    @Given("the user is on Profiterole home page")
    public void givenUserOnHomePage(){
        profiteroleHomeSteps.openPage();
    }

    @Given("the user clicks on Create Menu Button")
    public void givenClicksCreateMenuButon(){
        profiteroleHomeSteps.clickCreateMenuButton();
    }

    @Given("the user clicks on Menu on a Day Button")
    public void givenClicksMenuOnADayButton(){
        createMenuDropDownSteps.clickMenuOnADayButton();
    }

    @When("the user clicks on Breakfast Button")
    public void whenClicksBreakfastButton(){
        menuOnADaySteps.clickBreakfastButtonInMenuOnDay();
    }

    @Then("the user should see the page where he can create his own menu on a day")
    public void thenShouldSeeCreateRecipePage(){
        menuOnADaySteps.assertThatBreakfastCreateMenuOnADayPageIsVisible();
    }
}
