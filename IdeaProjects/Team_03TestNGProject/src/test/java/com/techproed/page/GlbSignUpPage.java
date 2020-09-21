package com.techproed.page;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlbSignUpPage {
    public GlbSignUpPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy( id= "email" )
    public WebElement emailBox;

    @FindBy( id = "name" )
    public WebElement nameBox;

    @FindBy( id= "mobile" )
    public WebElement mobileBox;

    @FindBy( id= "password" )
    public WebElement passwordBox;

    @FindBy( id= "re_password" )
    public WebElement confirmPasswordBox;

    @FindBy (name = "submit")
    public WebElement submitBOX;

    @FindBy(xpath = "//*[.='Success!']")
    public WebElement succes;
}


