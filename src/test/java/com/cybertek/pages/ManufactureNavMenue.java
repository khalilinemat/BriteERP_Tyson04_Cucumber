package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class ManufactureNavMenue {


    public ManufactureNavMenue(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='oe_menu_text'])[6]")
    public WebElement manufacture;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createBtn;

    @FindBy(css = "button[class='btn btn-sm btn-default o_button_import']")
    public WebElement importBtn;

    @FindBy(linkText = "Bills of Materials")
    public WebElement billsOfMaterialsBtn;

    @FindBy(css="span[class=oe_topbar_name]")
    public WebElement mManager;

    @FindBy(xpath = "//span[.='ManufacturingManager']")
    public WebElement manufactureList;

    @FindBy(linkText = "documentation")
    public WebElement documentation;

    @FindBy(xpath = "//a[.='Support']")
    public WebElement support;

    @FindBy(linkText = "Preferences")
    public WebElement preferences;

    @FindBy(linkText = "My Odoo.com account")
    public WebElement myOdoo;

    @FindBy(linkText = "Log out")
    public WebElement logOut;

    @FindBy(linkText = "Log out")
    public WebElement tryItFree;

    public void logOut(){
        manufactureList.click();
        BrowserUtils.wait(3);
        logOut.click();
    }

    public void goToCreate() {
        manufacture.click();
        BrowserUtils.wait(5);
        createBtn.click();
    }

    public void goToImport() {
        manufacture.click();
        BrowserUtils.wait(5);
        importBtn.click();
    }

    public void goToBillsOfMaterials() {
        manufacture.click();
        BrowserUtils.wait(5);
        billsOfMaterialsBtn.click();
    }

    public void goToSupport() {
       manufactureList.click();
        BrowserUtils.wait(5);
        support.click();
    }

    public void goToPreferences() {
        manufactureList.click();
        BrowserUtils.wait(5);
        preferences.click();
    }

    public void goToMyOdoo() {
        manufactureList.click();
        BrowserUtils.wait(5);
        myOdoo.click();
    }

    public void goToTryItFree() {
        manufactureList.click();
        BrowserUtils.wait(5);
        myOdoo.click();
        BrowserUtils.waitForVisibility(tryItFree, 5);
        tryItFree.click();
    }











}
