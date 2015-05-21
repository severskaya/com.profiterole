package com.profiterole.steps;

import com.profiterole.pages.LogInProfiterolePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class LogInProfiteroleSteps extends ScenarioSteps {

    private String infromationFromAfterLoginPage = "Добро пожаловать на сайт";
    LogInProfiterolePage logInProfiterolePage;

    @Step
    public void enterLoginIntoLoginField(String login){
        logInProfiterolePage.getEnterLoginField().sendKeys(login);
    }

    @Step
    public void enterPasswordIntoPasswordField(String password){
        logInProfiterolePage.getEnterPasswordField().sendKeys(password);
    }

    @Step
    public void clickEnterButtonInEntryWindow(){
        logInProfiterolePage.getEnterButtonInEntryMenu().click();
    }

    @Step
    public void isUserWasLogIn(){
        Assert.assertEquals(infromationFromAfterLoginPage, logInProfiterolePage.getInformationFromAfterLoginPage());
    }
}
