package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDowbloadTest extends TestBase {
    @Test
    public void fileE(){
        System.out.println( System.getProperty("user.dir"));
        // C:\Users\Muaz\IdeaProjects\Team_03TestNGProject
        System.out.println(System.getProperty("user.home"));
        //C:\Users\Muaz
        String userFilePath=System.getProperty("user.dir");
               //C:\Users\Muaz\IdeaProjects\Team_03TestNGProject
        String pomXmlFilePath = userFilePath+"/pom.xml";

        boolean isThere= Files.exists(Paths.get(pomXmlFilePath));
        System.out.println(isThere);//true   yes,there is
    }
@Test
    public void fileUpload(){
    driver.get("http://the-internet.herokuapp.com/upload");

    WebElement chooseFile= driver.findElement(By.id("file-upload"));
    chooseFile.sendKeys("C:\\Users\\Muaz\\Desktop");

    WebElement upload =driver.findElement(By.id("file-submit"));
    upload.click();

    WebElement fpl=driver.findElement(By.tagName("h3"));
    Assert.assertTrue(fpl.isDisplayed());
}
@Test
    public void fileDownload() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/download");
    WebElement pic = driver.findElement((By.partialLinkText("pic.png")));
    pic.click();
    Thread.sleep(3000);

    boolean isThere =Files.exists(Paths.get("C:\\Users\\Muaz\\Downloads"));
    Assert.assertTrue(isThere);

}
}
