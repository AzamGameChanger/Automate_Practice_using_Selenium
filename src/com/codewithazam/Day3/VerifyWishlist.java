package com.codewithazam.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class VerifyWishlist {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //Move mouse over women and click T-shirts
        WebElement women = driver.findElement(By.cssSelector("a[title='Women']"));
        WebElement tShirt = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(women);
        actions.moveToElement(tShirt).click().build().perform();

        //Move mouse to the product and add to wishlist
        WebElement product = driver.findElement(By.cssSelector(".product-container"));
        WebElement wishList = driver.findElement(By.cssSelector(".wishlist"));
        actions.moveToElement(product);
        actions.moveToElement(wishList).click().build().perform();

        //verify error
        String error = driver.findElement(By.cssSelector(".fancybox-error")).getText();
        if (error.contains("must be logged"))
            System.out.println(error);
        else
            System.out.println("Fail");

    }
}
