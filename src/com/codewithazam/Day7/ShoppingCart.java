package com.codewithazam.Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();

        String[] items = {"Cucumber", "Carrot", "Tomato"};

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < products.size(); i++) {
            String[] product = products.get(i).getText().split("-");
            String itemName = product[0].trim();

            List itemAdd = Arrays.asList(items);
            int j = 0;
            if (itemAdd.contains(itemName)) {
                driver.findElements(By.cssSelector("div[class='product-action']")).get(i).click();
                if (j == items.length) {
                    break;
                }
            }
        }
    }
}
