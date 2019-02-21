package com.cybertek.step_definitions;


import com.cybertek.pages.ManufactureNavMenue;
import com.cybertek.utilities.BrowserUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Import_Steps {

    ManufactureNavMenue menue = new ManufactureNavMenue();

    @When("manager click on import functinoality")
    public void manager_click_on_import_functinoality() {

        menue.goToSupport();
//        BrowserUtils.wait(3);
//        menue.goToTryItFree();


    }

    @Then("manager should see url")
    public void manager_should_see_url() {

        System.out.println("Hi ");

    }




}
