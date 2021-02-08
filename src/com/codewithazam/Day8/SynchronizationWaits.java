package com.codewithazam.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SynchronizationWaits {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        //implicit wait
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 5);
        String[] items = {"Cucumber", "Carrot", "Tomato"};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);
        addItems(driver, items);

        driver.findElement(By.cssSelector("[alt='Cart']")).click();
        driver.findElement(By.xpath("//div[@class='cart-preview active']/div[2]/button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

        driver.close();

    }

    public static void addItems(WebDriver driver, String[] items) {
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < products.size(); i++) {
            String[] product = products.get(i).getText().split("-");
            String itemName = product[0].trim();

            List itemAdd = Arrays.asList(items);
            if (itemAdd.contains(itemName)) {
                driver.findElements(By.cssSelector("div[class='product-action']")).get(i).click();
                if (j == items.length) {
                    break;
                }
            }
        }
    }
}
