package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleTest extends TestBase {

    @Test
    public void cokluPencereTest(){
        driver.get("https://the-internet.herokuapp.com/windows");

        String sayfaHandle = driver.getWindowHandle();
        System.out.println("ilk sayfanin handle'i: " + sayfaHandle);

        driver.findElement(By.partialLinkText("Click Here")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Set<String> tumPencereler = driver.getWindowHandles();

        for (String w: tumPencereler) {
            System.out.println(w);
        }

        Object[] array = (Object[]) tumPencereler.toArray();
        String ikinciPencereHandle = array[array.length-1].toString();

        System.out.println("Ikinci Pencere Handle'i : " + ikinciPencereHandle);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
