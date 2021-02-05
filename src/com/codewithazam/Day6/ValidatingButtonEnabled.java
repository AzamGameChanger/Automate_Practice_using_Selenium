package com.codewithazam.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidatingButtonEnabled {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.cssSelector("[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
        {
            System.out.println("Enabled");
            Assert.assertTrue(true);
        }else
        {
            System.out.println("Disabled");
            Assert.assertTrue(false);
        }
    }
}
