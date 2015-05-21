package com.profiterole.steps;

import com.profiterole.pages.ProfiterolesCuisinePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class ProfiteroleCuisineSteps extends ScenarioSteps {

    private String informationFromUkrainianDishesPage = "Украинская кухня";
    private String informationFromMexicoDishesPage = "Мексиканская кухня";
    private String informationFromFrenchDishesPage = "Французская кухня";
    private String informationFromUkrainianSnackspage = "Молоко";

    ProfiterolesCuisinePage profiterolesCuisinePage;

    @Step
    public void chooseCuisine(String cuisine){
        profiterolesCuisinePage.getCuisine(cuisine).click();
    }

    @Step
    public void clickOnShackButtonInUkrainianCuisine(){
        profiterolesCuisinePage.getSnacksButton().click();
    }

    @Step
    public void isUkrainianDishesPageVisible(){
        Assert.assertEquals(informationFromUkrainianDishesPage, profiterolesCuisinePage.getInformationFromUkrainianDishesPage());
    }

    @Step
    public void isMexicoDishesPageVisible(){
        Assert.assertEquals(informationFromMexicoDishesPage, profiterolesCuisinePage.getInformationFromMexicoDishesPage());
    }

    @Step
    public void isFrenchDishesPageVisible(){
        Assert.assertEquals(informationFromFrenchDishesPage, profiterolesCuisinePage.getInformationFromFrenchDishesPage());
    }

    @Step
    public void isUkrainianSnacksVisible(){
        Assert.assertEquals(informationFromUkrainianSnackspage, profiterolesCuisinePage.getInformationFromUkrainiansnacksPage());
    }
}
