package com.profiterole.jbehave;


import com.profiterole.steps.ProfiteroleHomeSteps;
import com.profiterole.steps.RecipesDropDownSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class TestCreateRecipeButton {

    @Steps
    private ProfiteroleHomeSteps profiteroleHomeSteps;

    @Steps
    private RecipesDropDownSteps recipesDropDownSteps;

    @Given("the user is on Profiterole home page")
    public void givenUserOnHomePage(){
        profiteroleHomeSteps.openPage();
    }

    @Given("the user clicks on Recipes Button")
    public void givenUserClicksRecipesButton(){
        profiteroleHomeSteps.clickRecipesButton();
    }

    @When("the user clicks on Create Recipe Button")
    public void whenUserClicksCreateRecipeButton(){
        recipesDropDownSteps.clickCreateRecipeButton();
    }

    @Then("the user should see the page where he can createhis own recipe")
    public void thenShouldSeeCreateRecipePage(){
        recipesDropDownSteps.isCreateRecipePageVisible();
    }

}
