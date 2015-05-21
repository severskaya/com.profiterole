package com.profiterole.steps;

import com.profiterole.pages.RecipesDropDownPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class RecipesDropDownSteps extends ScenarioSteps {

    private String informationFromAllCuisinesPage = "Выберите кухню";
    private String informationFromCreateRecipePage = "Создать рецепт";
    RecipesDropDownPage recipesDropDownPage;

    @Step
    public void clickAllRecipesButton() {
        recipesDropDownPage.getAllRecipesButtonInDropDownList().click();
    }

    @Step
    public void clickCreateRecipeButton() {
        recipesDropDownPage.getCreateRecipeButtonInDropDownList().click();
    }

    @Step
    public void isCuisinesVisibleForUser() {
        Assert.assertEquals(informationFromAllCuisinesPage, recipesDropDownPage.getTextFromAllCuisinePage());
    }

    @Step
    public void isCreateRecipePageVisible() {
        Assert.assertEquals(informationFromCreateRecipePage, recipesDropDownPage.getTextFromCreateRecipeProfiterolePage());
    }
}
