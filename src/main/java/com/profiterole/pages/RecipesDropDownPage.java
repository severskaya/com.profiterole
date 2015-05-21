package com.profiterole.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://gioia-profiterole.rhcloud.com/")
public class RecipesDropDownPage extends PageObject {

    public WebElementFacade getAllRecipesButtonInDropDownList(){
        return find(By.xpath("//a[@href = '/allOfRecipes']"));
    }

    public WebElementFacade getCreateRecipeButtonInDropDownList(){
        return find(By.xpath("//a[@href = '/addRecipes']"));
    }

    public WebElementFacade getTextFromAllCuisinePage(){
        return find(By.xpath("//h4[contains(text(), 'Выберите кухню')]"));
    }

    public WebElementFacade getTextFromCreateRecipeProfiterolePage(){
        return find(By.xpath("//h1[contains(text(), 'Создать рецепт')]"));
    }

}
