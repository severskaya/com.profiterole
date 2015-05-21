package com.profiterole.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;

import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://gioia-profiterole.rhcloud.com/")
public class ProfiteroleHomePage extends PageObject {

    public WebElementFacade getEnterButton(){
        return find(By.xpath("//a[@href = '/login']"));
    }

    public WebElementFacade getAboutUsButton(){
        return find(By.xpath("//a[@href = '/about']"));
    }

    public WebElementFacade getRecipesButton(){
        return find(By.xpath("//a[contains(text(), 'Рецепты')]"));
    }

    public WebElementFacade getCreateMenuButton(){
        return find(By.xpath("//a[contains(text(), 'Создать меню')]"));
    }

    public WebElementFacade getSerachField(){
        return find(By.xpath("//*[@name= 'searchUnit']"));
    }

    public WebElementFacade getAboutUsProfiterolePageInformation(){
        return find(By.xpath("//h2[contains(text(), 'О нас')]"));
    }
}