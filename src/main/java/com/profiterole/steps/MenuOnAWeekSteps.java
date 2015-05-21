package com.profiterole.steps;

import com.profiterole.pages.MenuOnAWeekPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class MenuOnAWeekSteps extends ScenarioSteps {

    private String countOfDaysFromMenuOnWeekPage = "7";
    MenuOnAWeekPage menuOnAWeekPage;

    @Step
    public void clickBreakfastButtonInMenuOnWeek(){
        menuOnAWeekPage.getBreakfastButtonInMenuOnWeek().click();
    }

    @Step
    public void clickDinnerButtonInMenuOnWeek(){
        menuOnAWeekPage.getDinnerButtonInMenuOnWeek().click();
    }

    @Step
    public void clickSupperButtonInMenuOnWeek(){
        menuOnAWeekPage.getSupperButtonInMenuOnWeek().click();
    }
    @Step
    public void clickMondayButton(){
        menuOnAWeekPage.getMondayButtonInMenuOnAWeek().click();
    }

    @Step
    public void clickTuesdayButton(){
        menuOnAWeekPage.getTuesdayButtonInMenuOnAWeek().click();
    }

    @Step
    public void clickWednesdayButton(){
        menuOnAWeekPage.getWednesdayButtonInMenuOnAWeek().click();
    }

    @Step
    public void clickThursdayButton(){
        menuOnAWeekPage.getThursdayButtonInMenuOnAWeek().click();
    }

    @Step
    public void clickFridayButton(){
        menuOnAWeekPage.getFridayButtonInMenuOnAWeek().click();
    }

    @Step
    public void clickSaturdayButton(){
        menuOnAWeekPage.getSaturdayButtonInMenuOnAWeek().click();
    }

    @Step
    public void clickSundayButton(){
        menuOnAWeekPage.getSundayButtonInMenuOnAWeek().click();
    }

    @Step
    public void isCreateMenuOnAWeekPageVisible(){
        Assert.assertEquals(countOfDaysFromMenuOnWeekPage, menuOnAWeekPage.getCountOfDaysFromMenuOnWeek());
    }
}
