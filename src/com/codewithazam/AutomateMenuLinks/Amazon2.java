package com.codewithazam.AutomateMenuLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Amazon2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.in");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);

        driver.findElement(By.linkText("Amazon Pay")).click();
        String payTitle = driver.getTitle();
        Assert.assertEquals(payTitle,"Amazon Pay");

        driver.navigate().back();
        Assert.assertEquals(title,"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

        driver.findElement(By.linkText("Customer Service")).click();
        String serviceTitle = driver.getTitle();
        Assert.assertEquals(serviceTitle,"Amazon.in Help: Help");

        driver.navigate().back();
        driver.quit();
    }
}
