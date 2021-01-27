package com.codewithazam.AutomateMenuLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class VerifyIncorrectValue {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".login")).click();
        driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("sami@inbox.ru");
        driver.findElement(By.id("SubmitCreate")).click();
        driver.findElement(By.cssSelector("[name='customer_firstname']")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("54321");
        driver.findElement(By.cssSelector("[id='passwd']")).sendKeys("iit883!!!!");
        driver.findElement(By.id("address1")).sendKeys("1222");
        driver.findElement(By.name("city")).sendKeys("12345");
        WebElement element = driver.findElement(By.id("id_state"));
        Select sl = new Select(element);
        sl.selectByValue("3");
        driver.findElement(By.id("phone_mobile")).sendKeys("hello");
        driver.findElement(By.id("submitAccount")).click();
        WebElement invalid = driver.findElement(By.cssSelector(".alert.alert-danger"));
        if (invalid.isDisplayed()){
            System.out.println("Verify");
        }else {
            System.out.println("Fail");
        }
    }
}
