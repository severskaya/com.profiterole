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
    public void assertThatUkrainianDishesPageIsVisible(){
        Assert.assertEquals("Страница 'Украинская кухня' не прогрузилась", informationFromUkrainianDishesPage, profiterolesCuisinePage.getInformationFromUkrainianDishesPage().getText());
    }

    @Step
    public void assertThatMexicoDishesPageIsVisible(){
        Assert.assertEquals("Страница 'Мексиканская кухня' не прогрузилась", informationFromMexicoDishesPage, profiterolesCuisinePage.getInformationFromMexicoDishesPage().getText());
    }

    @Step
    public void assertTahtFrenchDishesPageisVisible(){
        Assert.assertEquals("Страница 'Французская кухня' не прогрузилась", informationFromFrenchDishesPage, profiterolesCuisinePage.getInformationFromFrenchDishesPage().getText());
    }

    @Step
    public void assertThatUkrainianSnacksIsVisible(){
        Assert.assertEquals("Страница 'Закуски Украинской кухни' не прогрузилась", informationFromUkrainianSnackspage, profiterolesCuisinePage.getInformationFromUkrainiansnacksPage().getText());
    }
}
