package com.codewithazam.AutomateMenuLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Techlistic {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        driver.findElement(By.linkText("Java")).click();
        String javaTitle = driver.getTitle();
        Assert.assertEquals(javaTitle,"Java Tutorial For Beginners - Techlistic");
        driver.navigate().back();

        driver.findElement(By.cssSelector("[href*='selenium-tutorials']")).click();
        String seleniumTitle = driver.getTitle();
        Assert.assertEquals(seleniumTitle,seleniumTitle);
        driver.navigate().back();

        driver.findElement(By.xpath("//*[@id='PageList2']/div/div[1]/div[1]/div/ul/li[9]/a")).click();
        String blogTitle = driver.getTitle();
        Assert.assertEquals(blogTitle,"Best Selenium Blogs");
        driver.navigate().back();

        driver.findElement(By.cssSelector("[href*='testng']")).click();
        String testNGTitle = driver.getTitle();
        Assert.assertEquals(testNGTitle,"Selenium-TestNG Framework Tutorial");

        driver.quit();


    }
}
