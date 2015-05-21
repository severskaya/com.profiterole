package com.profiterole.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://gioia-profiterole.rhcloud.com/")
public class MenuOnADayPage extends PageObject {

    public WebElementFacade getBreakfastButtonInMenuOnDay(){
        return find(By.xpath("//*[@value = '#breakfast']"));
    }

    public WebElementFacade getDinnerButtonInMenuOnDay(){
        return find(By.xpath("//*[@value = '#dinner']"));
    }

    public WebElementFacade getSupperButtonInMenuOnDay(){
        return find(By.xpath("//*[@value = '#supper']"));
    }

    public WebElementFacade getInformationFromBreakfastCreateMenuOnDay(){
        return find(By.xpath("//h1[contains(text(), 'Ваш завтрак')]"));
    }
}
