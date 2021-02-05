package com.codewithazam.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CountEmailPage1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //parent-child traverse = parent/child tagname

        //google search bar
        /*driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("GME");
        driver.findElement(By.xpath("//input[@class='gNO89b']")).click();*/

        //image button
        driver.findElement(By.xpath("//*[@id='gb']/div/div[1]/div/div[2]/a")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
