package com.codewithazam.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.sql.Driver;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.fb.com");
        driver.manage().window().maximize();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl,"https://www.facebook.com/");
        String createAccount = driver.findElement(By.cssSelector("a[ajaxify='/reg/spotlight/']")).getText();
        System.out.println(createAccount);
        Assert.assertEquals(createAccount,"Create New Account");
        driver.findElement(By.cssSelector("a[ajaxify='/reg/spotlight/']")).click();

        Thread.sleep(3000L);
        //filling out register form
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Kaland");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Bel");
        driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("+13474442020");
        driver.findElement(By.id("password_step_input")).sendKeys("987654321Kb");

        WebElement month = driver.findElement(By.id("month"));
        Select m = new Select(month);
        m.selectByValue("5");

        WebElement day = driver.findElement(By.id("day"));
        Select d = new Select(day);
        d.selectByValue("3");

        WebElement year = driver.findElement(By.id("year"));
        Select y = new Select(year);
        y.selectByValue("2000");

        driver.findElement(By.cssSelector("input[value='2']")).click();
        driver.findElement(By.cssSelector("button[name='websubmit']")).click();



       /* Thread.sleep(3000);
        driver.quit();
*/
    }
}
