package com.codewithazam.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ActionPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Actions a = new Actions(driver);
//type capital letter to searchBox and double click;
        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        a.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("yota").doubleClick().build().perform();
//move mouse to electronics and right click;
        List<WebElement> tabs = driver.findElements(By.cssSelector("li[class='hl-cat-nav__js-tab']"));
        for (int i = 0; i < tabs.size(); i++) {
            if (tabs.get(i).getText().equalsIgnoreCase("Electronics")) {
                a.moveToElement(tabs.get(i)).contextClick().build().perform();
                break;
            }
        }
        Thread.sleep(5000);
        driver.close();
    }
}
