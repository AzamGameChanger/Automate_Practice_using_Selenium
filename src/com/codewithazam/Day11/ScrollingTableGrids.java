package com.codewithazam.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class ScrollingTableGrids {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,600)");
        Thread.sleep(3000);
        javascriptExecutor.executeScript("document.querySelector('.tableFixHead').scrollTop=5000;");

        List<WebElement> numbers = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = Integer.parseInt(numbers.get(i).getText());
            sum += number;
        }
        System.out.println("Sum " + sum);

        System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText());
        int actualValue = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(" ")[3]);
        Assert.assertEquals(actualValue, sum);

        Thread.sleep(3000);
        driver.quit();

    }
}
