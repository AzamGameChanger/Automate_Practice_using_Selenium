package com.codewithazam.AutomateMenuLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateAboutMe {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.cssSelector("[name='firstname']")).sendKeys("Azam");
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Sobirov");
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-2")).click();
        driver.findElement(By.cssSelector("input[id='datepicker']")).sendKeys("02.02.2020");
        driver.findElement(By.cssSelector("#profession-1")).click();
        driver.findElement(By.id("tool-2")).click();
        WebElement continent=driver.findElement(By.cssSelector("[id='continents']"));
        Select na = new Select(continent);
        na.selectByVisibleText("North America");
        WebElement commands = driver.findElement(By.id("selenium_commands"));
        Select command = new Select(commands);
        command.selectByVisibleText("WebElement Commands");
        command.selectByVisibleText("Navigation Commands");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(3000L);
        driver.quit();
    }
}
