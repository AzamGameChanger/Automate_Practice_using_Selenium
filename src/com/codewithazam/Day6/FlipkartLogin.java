package com.codewithazam.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FlipkartLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.flipkart.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("div[class='IiD88i _351hSN'] input[type='text']")).sendKeys("testcase@inbox.ru");
        driver.findElement(By.cssSelector("div[class='IiD88i _351hSN'] input[type='password']")).sendKeys("Test54321");
        driver.findElement(By.cssSelector("div[class='_1D1L_j'] button")).click();

        //Thread.sleep(3000);
       // driver.quit();
    }
}
