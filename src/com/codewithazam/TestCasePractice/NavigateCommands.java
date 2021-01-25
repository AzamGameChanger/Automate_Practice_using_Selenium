package com.codewithazam.TestCasePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.testandquiz.com/selenium/testing.html";
        driver.navigate().to(url);
        driver.findElement(By.linkText("This is a link")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to(url);
        driver.navigate().refresh();
        Thread.sleep(3000L);
        driver.close();


    }
}
