package com.codewithazam.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveMouse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.amazon.com");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement prime = driver.findElement(By.cssSelector("a[href*='primelink']"));
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        Actions a = new Actions(driver);
        a.moveToElement(prime).contextClick().build().perform();
        //.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
    }
}
