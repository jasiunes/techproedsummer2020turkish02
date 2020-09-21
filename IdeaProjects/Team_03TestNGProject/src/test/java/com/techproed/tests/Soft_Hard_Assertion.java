

package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Soft_Hard_Assertion {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test01(){
        driver.get("https://www.amazon.com/");
        String title = driver.getTitle();

        SoftAssert softAssert = new SoftAssert();

        //softAssert.assertEquals("DVDs", title);
        softAssert.assertTrue(driver.getTitle().contains("Amazon"));

        softAssert.assertAll();

    }

    @Test
    public void test02() {
        driver.get("http://a.testaddressbook.com/sign_in");

        SoftAssert softAssert = new SoftAssert();

        WebElement emailBox = driver.findElement(By.id("session_email"));
        emailBox.sendKeys("testtechproed@gmail.com");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        softAssert.assertTrue(emailBox.getText().equals("testtechproed@gmail.com"));

        WebElement passBox = driver.findElement(By.id("session_password"));
        passBox.sendKeys("Test1234!");



        WebElement signButton = driver.findElement(By.name("commit"));
        signButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        softAssert.assertTrue(signButton.isSelected());

        //WebElement signOutButton = driver.findElement(By.xpath("//*[.='Sign out']"));

        //boolean gorunuyorMu = signOutButton.isDisplayed();
        //Assert.assertTrue(gorunuyorMu);

        softAssert.assertAll();

    }
}
