package com.profiterole.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://gioia-profiterole.rhcloud.com/")
public class LogInProfiterolePage extends PageObject{

    public WebElementFacade getEnterLoginField(){
        return find(By.xpath("//*[@id='j_username']"));
    }

    public WebElementFacade getEnterPasswordField(){
        return find(By.xpath("//*[@id='j_password']"));
    }

    public WebElementFacade getEnterButtonInEntryMenu(){
        return find(By.xpath("//*[@type = 'submit']"));
    }

    public WebElementFacade getInformationFromAfterLoginPage(){
        return find(By.xpath("//h2[contains(text(), 'Добро пожаловать на сайт')]"));
    }

}
