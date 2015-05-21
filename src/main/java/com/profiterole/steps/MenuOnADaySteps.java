package com.profiterole.steps;

import com.profiterole.pages.MenuOnADayPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class MenuOnADaySteps extends ScenarioSteps {

    private String informationFromBreakfastCreateMenuOnDay = "Ваш завтрак";
    MenuOnADayPage menuOnADayPage;

    @Step
    public void clickBreakfastButtonInMenuOnDay(){
        menuOnADayPage.getBreakfastButtonInMenuOnDay().click();
    }

    @Step
    public void clickDinnerButtonInMenuOnDay(){
        menuOnADayPage.getDinnerButtonInMenuOnDay().click();
    }

    @Step
    public void clickSupperButtonInMenuOnDay(){
        menuOnADayPage.getSupperButtonInMenuOnDay().click();
    }

    @Step
    public void isBreakfasrCreateMenuOnADayPageVisible(){
        Assert.assertEquals(informationFromBreakfastCreateMenuOnDay, menuOnADayPage.getInformationFromBreakfastCreateMenuOnDay());
    }
}
