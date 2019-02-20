package com.cybertek.step_definitions;


import com.cybertek.pages.PreferencePage;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.cybertek.utilities.ApplicationConstants.PreferencesTitle;

public class Preference_Steps {

    PreferencePage preferencePage = new PreferencePage();

    @Then("manager clicks on Preferences functionality")
    public void manager_clicks_on_Preferences_functionality() {

       preferencePage.open();
        Assert.assertEquals(PreferencesTitle,"Change My Preferences");
    }


    @Then("manager clicks on Preferences functionality and Verify TimeZone")
    public void manager_clicks_on_Preferences_functionality_and_Verify_TimeZone() {

        preferencePage.open();
        Select select = new Select(preferencePage.TimeZone);//step4
        List<WebElement> drop = select.getOptions();//step5
        for (WebElement down : drop) {
            System.out.println(down.getText());
        }
    }




}


