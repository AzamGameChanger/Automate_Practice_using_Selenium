package com.codewithazam.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,5);

        driver.get("http://the-internet.herokuapp.com/dynamic_loading");
        driver.findElement(By.cssSelector("a[href*='1']")).click();
        driver.findElement(By.cssSelector("div[id='start'] button")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='finish']")));
        System.out.println(driver.findElement(By.cssSelector("div[id='finish']")).getText());
        driver.close();
    }
}
