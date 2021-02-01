package com.codewithazam.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutoSuggestions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("[name='p']")).sendKeys("Selenium");
        List<WebElement> role = driver.findElements(By.cssSelector("[role='option']"));
        for (WebElement element: role){
            if (element.getText().equalsIgnoreCase("selenium interview questions")){
                element.click();
                break;
            }
        }
    }
}
