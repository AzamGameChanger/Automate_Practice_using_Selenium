package com.codewithazam.GoDaddyBrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

    public static void main(String[] args) {
        //Test Case 1 - Launch browser and Open Godaddy.com

        //Steps to Automate:
        //1. Launch browser of your choice say., Firefox, chrome etc.
        System.setProperty("webdriver.chrome.driver","/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        //2. Open this URL - https://www.godaddy.com/
        String url = " https://www.godaddy.com/";
        driver.get(url);

        //3. Close browser.
        driver.quit();

    }
}
