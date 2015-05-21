package com.profiterole.steps;

import com.profiterole.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class ProfiteroleHomeSteps extends ScenarioSteps {

    ProfiteroleHomePage profiterolePage;

    private String aboutUsProfiterolePageInformation = "О нас";

    @Step
    public void openPage() {
        profiterolePage.open();
    }

    @Step
    public void clickAboutUsButton() {
        profiterolePage.getAboutUsButton().click();
    }

    @Step
    public void clickEnterButton() {
        profiterolePage.getEnterButton().click();
    }

    @Step
    public void clickRecipesButton() {
        profiterolePage.getRecipesButton().click();
    }

    @Step
    public void clickCreateMenuButton() {
        profiterolePage.getCreateMenuButton().click();
    }

    @Step
    public void enterQueryIntoSearchField(String query) {
        profiterolePage.getSerachField().sendKeys(query);
    }

    @Step
    public void iskAboutUsPageWasOpened(){
        Assert.assertEquals(aboutUsProfiterolePageInformation, profiterolePage.getAboutUsProfiterolePageInformation());
    }
}