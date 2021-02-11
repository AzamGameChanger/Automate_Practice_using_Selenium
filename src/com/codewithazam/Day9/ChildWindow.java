package com.codewithazam.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ChildWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();

        //driver.findElement(By.id("tabButton")).click();
        driver.findElement(By.id("windowButton")).click();
        Set<String> windowHandles= driver.getWindowHandles();
        Iterator<String> it = windowHandles.iterator();
        String parent = it.next();
        String child = it.next();

        driver.switchTo().window(child);
        System.out.println(driver.findElement(By.cssSelector("h1[id='sampleHeading']")).getText());
        driver.findElement(By.cssSelector("h1[id='sampleHeading']")).getText();
        System.out.println(driver.findElement(By.cssSelector("h1[id='sampleHeading']")).getText().split(" ")[3].trim());


    }
}
