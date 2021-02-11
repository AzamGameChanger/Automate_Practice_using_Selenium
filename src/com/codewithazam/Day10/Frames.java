package com.codewithazam.Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/frames");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("a[href*='iframe']")).click();
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
        System.out.println(driver.findElement(By.cssSelector("[id='tinymce']")).getText());
        driver.findElement(By.id("tinymce")).sendKeys("Happy holidays!");

        Thread.sleep(3000);
        driver.quit();
    }
}
