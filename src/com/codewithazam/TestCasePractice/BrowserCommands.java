package com.codewithazam.TestCasePractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrowserCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.google.co.in/";
        driver.get(url);
        String title = driver.getTitle();
        int titleLength = title.length();
        System.out.println("Title : " +  title);
        System.out.println("Title length: " + titleLength);
        String pageURL = driver.getCurrentUrl();
        Assert.assertTrue(pageURL.equalsIgnoreCase(url));
        String pageSource = driver.getPageSource();
        int pageSourceLength = pageSource.length();
        System.out.println("Page Source length : " + pageSourceLength);
        driver.close();
    }
}
