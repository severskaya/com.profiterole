package com.profiterole.jbehave;


import com.profiterole.steps.CreateMenuDropDownSteps;
import com.profiterole.steps.MenuOnAWeekSteps;
import com.profiterole.steps.ProfiteroleHomeSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class TestMondayButtonMenuOnAWeek {

    @Steps
    private ProfiteroleHomeSteps profiteroleHomeSteps;

    @Steps
    private CreateMenuDropDownSteps createMenuDropDownSteps;

    @Steps
    MenuOnAWeekSteps menuOnAWeekSteps;

    @Given("the user is on Profiterole home page")
    public void givenUserOnHomePage(){
        profiteroleHomeSteps.openPage();
    }

    @Given("the user clicks on Create Menu Button")
    public void givenClicksCreateMenuButton(){
        profiteroleHomeSteps.clickCreateMenuButton();
    }

    @Given("the user clicks on Menu on a Week Button")
    public void givenClickMenuOnAWeekButon(){
        createMenuDropDownSteps.clickMenuOnaWeekButton();
    }

    @When("the user clicks on Mo Button")
    public void whenClicksMondayButton(){
        menuOnAWeekSteps.clickMondayButton();
    }

    @When("the user clicks on Dinner Button")
    public void whenClicksDinnerDutton(){
        menuOnAWeekSteps.clickDinnerButtonInMenuOnWeek();
    }

    @Then("the user shoild see the page where he can create his own menu on a week")
    public void thenShouldSeeCreateMenuOnAWeekPage(){
        menuOnAWeekSteps.assertThatCreateMenuOnAWeekPageIsVisible();
    }
}
