package com.codewithazam.GoDaddyBrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase6 {
    public static void main(String[] args) {
        //Test Case 6 - Open Godaddy.com and Validate Page Title

        //Steps to Automate:
        //1. Launch browser of your choice say., Firefox, chrome etc.
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        //2. Open this URL - https://www.godaddy.com/
        driver.get(" https://www.godaddy.com/");

        //3. Maximize or set size of browser window.
        driver.manage().window().maximize();

        //4. Get Title of page and validate it with expected value.
        String title = driver.getTitle();
        if (title.equalsIgnoreCase("Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        //5. Get URL of current page and validate it with expected value.
        String url = driver.getCurrentUrl();
        if (url.equalsIgnoreCase("https://www.godaddy.com/")) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        //6. Get Page source of web page.
        String pageSource = driver.getPageSource();

        //7. And Validate that page title is present in page source.
        if (pageSource.contains(title)) {
            System.out.println("Pass");
        } else {
            System.out.println("Not found");
        }

        //8. Close browser.
        driver.quit();
    }
}
