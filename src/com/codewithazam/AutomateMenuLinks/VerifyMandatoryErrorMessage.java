package com.codewithazam.AutomateMenuLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyMandatoryErrorMessage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".login")).click();
        driver.findElement(By.id("email_create")).sendKeys("alek@mail.ru");
        driver.findElement(By.xpath("//button[@name='SubmitCreate']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[name='submitAccount']")).click();
        WebElement register = driver.findElement(By.cssSelector(".alert.alert-danger"));
        String regText = register.getText();
        if(register.isDisplayed()){
            System.out.println("Verify");
        }else {
            System.out.println("Null");
        }
        System.out.println("__________");
        System.out.println(regText);
    }
}
