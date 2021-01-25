package com.codewithazam.GoDaddyBrowserCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
    public static void main(String[] args) throws InterruptedException {
        //Test Case 3 - Open Godaddy.com and Print it's Page title.

        //Steps to Automate:
        //1. Launch browser of your choice say., Firefox, chrome etc.
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        //2. Open this URL - https://www.godaddy.com/
        driver.get("https://www.godaddy.com/");

        //3. Maximize or set size of browser window.
        driver.manage().window().maximize();

        //4.Get Title of page and print it.
        System.out.println(driver.getTitle());
        Thread.sleep(3000L);

        //5. Close browser.
        driver.quit();


    }
}
