package com.codewithazam.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseCommand {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

        driver.findElement(By.id("windowButton")).click();
        driver.close();
    }
}
