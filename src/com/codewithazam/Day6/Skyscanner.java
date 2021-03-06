package com.codewithazam.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Skyscanner {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.skyscanner.com/");
        driver.manage().window().maximize();
        System.out.println(driver.findElement(By.cssSelector("[id='return-fsc-datepicker-button']")).getAttribute("class"));
        driver.findElement(By.cssSelector("[id='fsc-trip-type-selector-one-way']")).click();
        System.out.println(driver.findElement(By.cssSelector("[id='return-fsc-datepicker-button']")).getAttribute("class"));
        if (driver.findElement(By.cssSelector("[id='return-fsc-datepicker-button']")).getAttribute("class").contains("disabled")){
            System.out.println("Disabled");
            Assert.assertTrue(true);
        }else{
            System.out.println("Enabled");
            Assert.assertTrue(false);
        }

    }
}
