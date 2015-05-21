package com.profiterole.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://gioia-profiterole.rhcloud.com/")
public class CreateMenuDropDownPage extends PageObject {

    public WebElementFacade getMenuOnADayInDropDownList(){
        return find(By.xpath("//a[contains(text(), 'Меню на день')]"));
    }

    public WebElementFacade getMenuOnAWeekInDropDownList(){
        return find(By.xpath("//a[contains(text(), 'Меню на неделю')]"));
    }

    public WebElementFacade getCountOfVariablesFromCreateMenuOnDayPage(){
        return find(By.xpath("count(//*[@class = 'btn btn-large no-outline'])"));
    }

    public WebElementFacade getCountOfDaysFromCreateMenuOnWeek(){
        return find(By.xpath("count(//*[@class = 'btn btn-large dayOfWeekButton'])"));
    }
}
