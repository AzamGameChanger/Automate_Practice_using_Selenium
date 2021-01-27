package com.codewithazam.AutomateMenuLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateMessage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(" [class='header_user_info'] a")).click();
        driver.findElement(By.cssSelector("[id='email_create']")).sendKeys("aaaaaa");
        driver.findElement(By.cssSelector("[name='SubmitCreate']")).click();
        Thread.sleep(3000L);
        String error = driver.findElement(By.id("create_account_error")).getText();
        if (error.contains("Invalid email address.")) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

    }
}
