package com.cybertek.pages;


import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ImportPage {

    public ImportPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

}
