package com.codewithazam.Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://shop.demoqa.com/");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        int length = driver.getTitle().length();
        System.out.println("Title: " + title);
        System.out.println("Title length: " + length);

        String url = driver.getCurrentUrl();
        if (url.contains("shop.demoqa.com"))
            System.out.println("Pass");
        else
            System.out.println("Fail");
        System.out.println(url);

        String pageSource = driver.getPageSource();
        int pageLength = pageSource.length();
        System.out.println(pageLength);
        Thread.sleep(3000);

        driver.close();


    }
}
