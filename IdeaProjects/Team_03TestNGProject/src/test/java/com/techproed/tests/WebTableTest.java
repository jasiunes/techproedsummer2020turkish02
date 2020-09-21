package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest extends TestBase {

    public void giris(){
        driver.get("http://fhctrip-qa.com/admin/HotelRoomAdmin");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!"+ Keys.ENTER);
    }
    @Test
    public void table(){
        giris();

        List<WebElement> baslik = driver.findElements(By.xpath("//thead/tr/th"));
        for (WebElement w: baslik) {
            System.out.print(w.getText() + " ");
        }

        System.out.println();

        WebElement tbody = driver.findElement(By.xpath("//tbody"));
        System.out.println(tbody.getText());

    }

    @Test
    public void dokuzBesTest(){
        giris();

        WebElement dokuzBes = driver.findElement(By.xpath("//tbody/tr[9]/td[5]"));
        System.out.println(dokuzBes.getText());

    }

    @Test
    public void baslik2Test(){
        giris();

        List<WebElement> baslik2 = driver.findElements(By.xpath("//thead/tr[2]/th"));
        for (WebElement w: baslik2) {
            System.out.println(w.getText());
        }
    }

    @Test
    public void bul(){
        giris();

        hucreYazdir(3,5);
        hucreYazdir(4,4);
        hucreYazdir(8,2);
        hucreYazdir(9,1);
        hucreYazdir(6,1);
    }

    public void hucreYazdir(int satir, int sutun){
        //tbody/tr[satir]/td[sutun]

        String locateDegeri = "//tbody/tr[" + satir + "]/td[" + sutun + "]";

        WebElement hucre = driver.findElement(By.xpath(locateDegeri));
        System.out.println(hucre.getText());

    }

}