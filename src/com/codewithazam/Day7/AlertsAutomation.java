package com.codewithazam.Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //click an alert
        driver.findElement(By.cssSelector("[onclick='jsAlert()']")).click();
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("result")).getText());

        //dismiss or accept alert
        driver.findElement(By.cssSelector("[onclick='jsConfirm()']")).click();
        driver.switchTo().alert().dismiss();
        //driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("result")).getText());

        //enter the text to alert
        driver.findElement(By.cssSelector("[onclick='jsPrompt()']")).click();
        driver.switchTo().alert().sendKeys("Hello World");
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("result")).getText());

        driver.close();
    }
}
