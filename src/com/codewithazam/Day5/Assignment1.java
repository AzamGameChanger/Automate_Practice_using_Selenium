package com.codewithazam.Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qatechhub.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        if(title.equalsIgnoreCase("QA Automation Tools Trainings and Tutorials | QA Tech Hub"))
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        String pageURL = driver.getCurrentUrl();
        System.out.println(pageURL);
        driver.navigate().forward();
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();
    }
}
