package com.codewithazam.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,5);

        driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.cssSelector("a[href*='loadAjax']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='results']")));
        System.out.println(driver.findElement(By.cssSelector("div[id='results']")).getText());
        driver.close();
    }
}
