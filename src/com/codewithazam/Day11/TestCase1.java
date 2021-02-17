package com.codewithazam.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestCase1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/home");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.id("checkin")).click();

        while (!driver.findElement(By.cssSelector("[class='datepicker -bottom-left- -from-bottom- active'] [class='datepicker--nav-title']")).getText().contains("June")) {
            //Thread.sleep(2);
            driver.findElement(By.cssSelector("[class='datepicker -bottom-left- -from-bottom- active'] [data-action='next']")).click();
        }

        List<WebElement> days = driver.findElements(By.cssSelector("div[class*='datepicker--cell datepicker--cell-day']"));

        for (int i = 0; i < days.size(); i++) {
            String text = days.get(i).getText();
            if (text.equalsIgnoreCase("20")) {
                days.get(i).click();
                break;
            }
        }

    }
}
