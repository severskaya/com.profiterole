package com.profiterole.steps.jbehave;

import com.profiterole.steps.actions.ProfiteroleCuisineSteps;
import com.profiterole.steps.actions.ProfiteroleHomeSteps;
import com.profiterole.steps.actions.RecipesDropDownSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class TestChooseFrenchCuisineInAllRecipes {

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

    @When("the user clicks on French cuisine")
    public void whenClicksOnFrenchCuisine(){
        profiteroleCuisineSteps.chooseCuisine("Французская");
    }

    @Then("the user should see the page with all French dishes")
    public void thenShouldSeePageWithAllFrenchDishes(){
        profiteroleCuisineSteps.assertTahtFrenchDishesPageisVisible();
    }

}
