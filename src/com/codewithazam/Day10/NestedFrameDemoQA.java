package com.codewithazam.Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameDemoQA {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();

        driver.switchTo().frame("frame1");
        driver.switchTo().frame(driver.findElement(By.xpath("//body/iframe[1]")));

        System.out.println(driver.findElement(By.xpath("//body/p")).getText());

        Thread.sleep(3000);
        driver.quit();
    }
}
