package com.techproed.smoketests;
import com.techproed.page.GlbSignUpPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import org.testng.annotations.Test;

public class GlbSignUpTest {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_url"));
        GlbSignUpPage element = new GlbSignUpPage();
        element.emailBox.sendKeys(ConfigurationReader.getProperty("glb_email"));
        element.nameBox.sendKeys(ConfigurationReader.getProperty("glb_name"));
        element.mobileBox.sendKeys(ConfigurationReader.getProperty("glb_phone"));
        element.passwordBox.sendKeys(ConfigurationReader.getProperty("glb_pass"));
        element.confirmPasswordBox.sendKeys(ConfigurationReader.getProperty("glb_pass"));
        element.submitBOX.click();
    }
}