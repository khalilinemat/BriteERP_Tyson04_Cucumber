package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class Support_Steps {

    public Support_Steps(){

        PageFactory.initElements(Driver.getDriver(), this);
    }








}
