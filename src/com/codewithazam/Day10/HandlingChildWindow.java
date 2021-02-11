package com.codewithazam.Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandlingChildWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("a[href*='windows']")).click();
        driver.findElement(By.cssSelector("a[href*='windows/new']")).click();

        Set<String> windows =driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parent = it.next();
        String child = it.next();

        driver.switchTo().window(child);
        System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

        driver.switchTo().window(parent);
        System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

        Thread.sleep(3000);
        driver.quit();



    }
}
