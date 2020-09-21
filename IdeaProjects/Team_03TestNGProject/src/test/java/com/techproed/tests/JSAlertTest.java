package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JSAlertTest {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void JSAlertTest(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //<button onclick="jsAlert()">Click for JS Alert</button>
        WebElement button = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        button.click();

        String alertMesaji = driver.switchTo().alert().getText();
        System.out.println(alertMesaji);

        driver.switchTo().alert().accept();
    }

    @Test
    public void JSConfirmTest(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //<button onclick="jsAlert()">Click for JS Alert</button>
        WebElement button = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        button.click();

        String mesaj = driver.switchTo().alert().getText();
        System.out.println(mesaj);

        driver.switchTo().alert().dismiss();
    }

    @Test
    public void JSPromptTest(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //<button onclick="jsPrompt()">Click for JS Prompt</button>
        WebElement button = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        button.click();

        String mesaj = driver.switchTo().alert().getText();
        System.out.println(mesaj);

        driver.switchTo().alert().sendKeys("Elveda Allert!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.switchTo().alert().accept();
    }

}