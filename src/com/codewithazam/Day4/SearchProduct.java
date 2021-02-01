package com.codewithazam.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SearchProduct {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement women = driver.findElement(By.cssSelector("a[title='Women']"));
        WebElement tShirts = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(women).moveToElement(tShirts).click().build().perform();
        String productName = driver.findElement(By.xpath("//div[@class='product-container']/div[2]/h5/a")).getText();
        System.out.println(productName);
        driver.findElement(By.id("search_query_top")).sendKeys(productName);
        driver.findElement(By.name("submit_search")).click();
        String productAfterSearch = driver.findElement(By.xpath(" //*[@id='center_column']/ul/li/div/div[2]/h5")).getText();
        if (productName.equalsIgnoreCase(productAfterSearch))
            System.out.println("Pass");
        else
            System.out.println("Fail");
        Thread.sleep(3000);
        driver.close();

    }
}
