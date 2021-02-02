package com.codewithazam.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Assignment3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://flipkart.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        List<WebElement> links = driver.findElements(By.tagName("a"));
        int numberLink = links.size();
        System.out.println(numberLink);
        for(WebElement link: links){
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
            System.out.println("______________________________");
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
