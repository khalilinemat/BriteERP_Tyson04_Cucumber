package com.cybertek.step_definitions;


import com.cybertek.pages.PreferencePage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
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

    @Then("manger clicks on Preferences functionality and verify Language functionality")
    public void manger_clicks_on_Preferences_functionality_and_verify_Language_functionality() {

        preferencePage.open();
        preferencePage.language.getText();
        Select select = new Select(preferencePage.language);//step4
        List<WebElement> drop = select.getOptions();//step5
        for (WebElement down : drop) {
            System.out.println(down.getText());

        }
    }

    @Then("manger clicks on Preferences functionality")
    public void manger_clicks_on_Preferences_functionality() {
        preferencePage.open();
    }

    @Then("verify Notification Management functionality")
    public void verify_Notification_Management_functionality() {
        String notif = preferencePage.NotifManag.getText();
        Assert.assertEquals(notif, "Notification Management");//step4
        preferencePage.NotifManag.click();//step5
    }

    @Then("verify  Signature functionality")
    public void verify_Signature_functionality() {
        Assert.assertEquals(preferencePage.signature.getText(),"Signature");

    }

    @Then("verify Forum Karma functionality")
    public void verify_Forum_Karma_functionality() {
        Assert.assertEquals(preferencePage.forumKarma.getText(),"Forum Karma");

    }

    @Then("verify Change password functionality")
    public void verify_Change_password_functionality() {

        preferencePage.changePassword.click();
        BrowserUtils.wait(10);
        Assert.assertEquals(Driver.getDriver().getTitle(),"Change Password - Odoo");
    }

    @Then("verify  Cancel button and clickable")
    public void verify_Cancel_button_and_clickable() {
        preferencePage.changePassword.click();
        BrowserUtils.wait(10);
        Assert.assertEquals(preferencePage.cancel.getText(),"Cancel");
        preferencePage.cancel.click();

    }


    @Then("verifying Save button and clickable")
    public void verifying_Save_button_and_clickable() {
        String save = preferencePage.SaveButton.getText();
        Assert.assertEquals(save, "Save");

        preferencePage.SaveButton.click();
    }

    @Then("verifying cancel button and clickable")
    public void verifying_cancel_button_and_clickable() {
        String cancel = preferencePage.CancelButton.getText();
        Assert.assertEquals(cancel, "Cancel");
        preferencePage.CancelButton.click();
    }









}


