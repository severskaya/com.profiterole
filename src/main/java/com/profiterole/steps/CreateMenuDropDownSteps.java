package com.profiterole.steps;

import com.profiterole.pages.CreateMenuDropDownPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class CreateMenuDropDownSteps extends ScenarioSteps {

    private String countOfDaysFromCreateMenuOnWeek = "7";
    private String countOfVariablesFromCreatemenuOnDay = "3";
    CreateMenuDropDownPage createMenuDropDownPage;

    private String expectedXPath = "//div[@class = 'btn-group no-outline']/child::*";

    @Step
    public void clickMenuOnADayButton(){
        createMenuDropDownPage.getMenuOnADayInDropDownList().click();
    }

    @Step
    public void clickMenuOnaWeekButton(){
        createMenuDropDownPage.getMenuOnAWeekInDropDownList().click();
    }

    @Step
    public void isCreateMenuOnADayPageVisible(){

        Assert.assertEquals(countOfVariablesFromCreatemenuOnDay, createMenuDropDownPage.getCountOfVariablesFromCreateMenuOnDayPage());
    }

    @Step
    public void isPageWithSevenDaysVisible(){

        Assert.assertEquals(countOfDaysFromCreateMenuOnWeek, createMenuDropDownPage.getCountOfDaysFromCreateMenuOnWeek());
    }

}
