package com.profiterole.steps.actions;

import com.profiterole.pages.CreateMenuDropDownPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.junit.Assert.*;


public class CreateMenuDropDownSteps extends ScenarioSteps {

    private String countOfDaysFromCreateMenuOnWeek = "7";
    private String countOfVariablesFromCreatemenuOnDay = "3";
    CreateMenuDropDownPage createMenuDropDownPage;



    @Step
    public void clickMenuOnADayButton() {
        createMenuDropDownPage.getMenuOnADayInDropDownList().click();
    }

    @Step
    public void clickMenuOnaWeekButton() {
        createMenuDropDownPage.getMenuOnAWeekInDropDownList().click();
    }

    @Step
    public void assertThatCreateMenuOnADayPageIsVisible() {

        assertEquals("Страница Создать меню на день не прогрузилась", countOfVariablesFromCreatemenuOnDay, createMenuDropDownPage.getCountOfVariablesFromCreateMenuOnDayPage().getValue());
    }

    @Step
    public void assertThatPageWithSevenDaysIsVisible() {

       assertEquals("Страница 7 дней недели не прогрузилась", countOfDaysFromCreateMenuOnWeek, createMenuDropDownPage.getCountOfDaysFromCreateMenuOnWeek().getValue());
    }
}
