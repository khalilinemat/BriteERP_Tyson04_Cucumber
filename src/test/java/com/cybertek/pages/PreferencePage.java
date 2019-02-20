package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PreferencePage {

    public PreferencePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[6]")
    public WebElement ManufactLink;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement ManufactDropDown;

    @FindBy(linkText = "Preferences")
    public WebElement Preferences;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement topBarMenu;


    @FindBy(xpath = "//input[@id='radio230_email']")
    public WebElement HandleEmail;

    @FindBy(xpath = "(//h4[@class='modal-title'])[1]")
    public WebElement Title;

    @FindBy(xpath = "//select[@name='tz']")
    public WebElement TimeZone;

    @FindBy(xpath = "//*[@class='btn btn-sm btn-primary']")
    public WebElement SaveButton;

    @FindBy(xpath = "//*[@class='btn btn-sm btn-default']")
    public WebElement CancelButton;

    @FindBy(xpath = "//select[@class='o_input o_field_widget']")
    public WebElement language;

    @FindBy(xpath = "(//label)[5]")
    public WebElement NotifManag;

    @FindBy(xpath = "(//label)[10]")
    public WebElement signature;

    @FindBy(xpath = "(//label)[9]")
    public WebElement forumKarma;

    @FindBy(name = "preference_change_password")
    public WebElement changePassword;

    @FindBy(xpath = "//*[@class='btn btn-sm btn-default oe_form_button oe_form_button_cancel']")
    public WebElement cancel;




    public void open () {

        topBarMenu.click();
        Preferences.click();
    }


}
