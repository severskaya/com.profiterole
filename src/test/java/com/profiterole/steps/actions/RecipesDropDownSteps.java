package com.profiterole.steps.actions;

import com.profiterole.pages.RecipesDropDownPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.junit.Assert.*;

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
    public void assertThatCuisinesAreVisibleForUser() {
        assertEquals("Кухни не видны пользователю", informationFromAllCuisinesPage, recipesDropDownPage.getTextFromAllCuisinePage().getValue());
    }

    @Step
    public void assertThatCreateRecipePageIsVisible() {
        assertEquals("Страница с созданием рецептов не видна", informationFromCreateRecipePage, recipesDropDownPage.getTextFromCreateRecipeProfiterolePage().getValue());
    }
}
