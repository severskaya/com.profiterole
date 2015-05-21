package com.profiterole.jbehave;


import com.profiterole.steps.ProfiteroleCuisineSteps;
import com.profiterole.steps.ProfiteroleHomeSteps;
import com.profiterole.steps.RecipesDropDownSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class TestChooseMexicoCuisineInAllRecipes {

    @Steps
    private ProfiteroleCuisineSteps profiteroleCuisineSteps;

    @Steps
    private ProfiteroleHomeSteps profiteroleHomeSteps;

    @Steps
    private RecipesDropDownSteps recipesDropDownSteps;

    @Given("the user is on Profiterole home page")
    public void givenUserOnHomePage(){
        profiteroleHomeSteps.openPage();
    }

    @Given("the user clicks on Recipes Button")
    public void givenClicksRecipesButton(){
        profiteroleHomeSteps.clickRecipesButton();
    }

    @Given("the user clicks on All Recipes Button")
    public void givenClicksAllRecipesButton(){
        recipesDropDownSteps.clickAllRecipesButton();
    }

    @When("the user clicks on Mexico cuisine")
    public void whenClicksMexicoCuisine(){
        profiteroleCuisineSteps.chooseCuisine("Мексиканская");
    }

    @Then("the user should see the page with all Mexico dishes")
    public void thenShouldSeeMexicoDishesPage(){
        profiteroleCuisineSteps.isMexicoDishesPageVisible();
    }

}
