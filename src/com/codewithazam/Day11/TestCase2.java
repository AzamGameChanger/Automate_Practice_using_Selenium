package com.codewithazam.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class TestCase2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://phptravels.com/demo/");
        driver.manage().window().maximize();

        System.out.println(driver.findElements(By.tagName("a")).size());

        WebElement footerDriver = driver.findElement(By.cssSelector("footer[class='BS-footer']"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        WebElement firstRow = driver.findElement(By.cssSelector("div.col-xs-6.col-sm-4.col-md-2.links.banner-maker"));
        System.out.println(firstRow.findElements(By.tagName("a")).size());

        for (int i = 0; i < firstRow.findElements(By.tagName("a")).size(); i++) {
            String click = Keys.chord(Keys.COMMAND, Keys.RETURN);
            firstRow.findElements(By.tagName("a")).get(i).sendKeys(click);
            Thread.sleep(3000);

        }
        Set<String> abc = driver.getWindowHandles();
        Iterator<String> it = abc.iterator();
        while (it.hasNext()) {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
