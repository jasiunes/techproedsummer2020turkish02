package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass extends TestBase {
    @Test
    public void rightClick() {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement element = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.contextClick(element).perform();
    }

    @Test
    public void doubleC() {
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(button).perform();
    }

    @Test
    public void hoverOver() {
        driver.get("http://ebay.com");
        WebElement menu = driver.findElement(By.partialLinkText("Toys"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).click().perform();
    }

    @Test
    public void upDown() throws InterruptedException {
        driver.get("http://amazon.com");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.END).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_UP).perform();
    }

    @Test
    public void writing() {
        driver.get("http://amazon.com");
        WebElement searchB = driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions = new Actions(driver);
        actions.moveToElement(searchB).click()
                .keyDown(Keys.SHIFT)
                .sendKeys("samsung ")
                .keyUp(Keys.SHIFT)
                .sendKeys("kulaklik")
                .perform();
    }

    @Test
    public void dragAndDrop() {
        driver.get("http://google.com");
        WebElement search = driver.findElement(By.name("q"));
        WebElement logo = driver.findElement(By.id("hplogo"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(logo,search).perform();

    }
}