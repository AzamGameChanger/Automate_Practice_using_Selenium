package com.codewithazam.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class FluenttWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading");
        driver.findElement(By.cssSelector("a[href*='/dynamic_loading/1']")).click();
        driver.findElement(By.cssSelector("div[id='start'] button")).click();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

            public WebElement apply(WebDriver driver) {
                if (driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed()) {
                    return driver.findElement(By.cssSelector("div[id='finish'] h4"));
                } else
                    return null;
            }
        });
        System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed());

        driver.close();
    }
}
