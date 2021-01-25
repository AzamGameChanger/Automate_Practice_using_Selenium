package com.codewithazam.AutomateMenuLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.in");
        driver.manage().window().maximize();
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        driver.findElement(By.linkText("Amazon Pay")).click();
        String titlePay = driver.getTitle();
        System.out.println(titlePay);
        driver.navigate().back();
        String title = driver.getTitle();
        if (title.equalsIgnoreCase(pageTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        driver.quit();
    }
}
