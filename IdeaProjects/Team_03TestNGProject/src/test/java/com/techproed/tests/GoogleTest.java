package com.techproed.tests;

import com.techproed.page.GooglePage;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class GoogleTest extends TestBase {
    @Test
    public void searchBTest(){
        driver.get("http://google.com");
        GooglePage googlePage=new GooglePage(driver);
        googlePage.searchB.sendKeys("the life is beautiful");
    }
}
