package com.codewithazam.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Email {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.ru/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("input[name='login']")).sendKeys("testcase@mail.ru");
        driver.findElement(By.cssSelector("button[data-testid='enter-password']")).click();
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Test12345");
        driver.findElement(By.cssSelector("button[data-testid='login-to-mail']")).click();

        driver.findElement(By.cssSelector(".compose-button__txt")).click();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//html/body/div[16]/div[2]/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div/div[2]/div/div/label/div/div/input")).sendKeys("testreceiver@gmail.com");
        driver.findElement(By.name("Subject")).sendKeys("Happy Wednesday!");
        driver.findElement(By.xpath("//html/body/div[16]/div[2]/div/div[1]/div[2]/div[3]/div[5]/div/div/div[2]/div[1]/div[2]")).sendKeys("Hello World !");
        driver.findElement(By.xpath("//html/body/div[16]/div[2]/div/div[2]/div[1]/span[1]/span/span")).click();

        driver.quit();
    }
}
