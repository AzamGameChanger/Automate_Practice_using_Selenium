package com.codewithazam.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Assignment4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("gh-ac")).sendKeys("Apple Watches");
        WebElement category = driver.findElement(By.id("gh-cat"));
        Select select = new Select(category);
        select.selectByValue("15032");

        driver.findElement(By.id("gh-btn")).click();
        Thread.sleep(3000L);
        String result = driver.findElement(By.xpath("//*[@id='mainContent']/div[1]/div/div[2]/div[1]/div[1]/h1/span[2]")).getText();
        System.out.println(result);

        List<WebElement> products = driver.findElements(By.xpath("//*[@id='srp-river-results']/ul/li/div/div[2]/a/h3"));

        //print all products along with scroll down
        Actions action = new Actions(driver);
        for (WebElement product : products) {
            action.moveToElement(product).build().perform();
            System.out.println(product.getText());
        }

        //print 10th product
       /* int size = products.size();
        for (int i = 0; i < size; i++) {
           String productsName= products.get(9).getText();
            System.out.println(productsName);
            break;
        }*/

        driver.quit();


    }
}
