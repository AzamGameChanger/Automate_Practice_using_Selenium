package com.codewithazam.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class EcommerceAutomation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //Login to the website
        driver.findElement(By.cssSelector(".login")).click();
        driver.findElement(By.id("email")).sendKeys("ibragimov.azamkhuja@inbox.ru");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("215130Automate");
        driver.findElement(By.cssSelector("#SubmitLogin")).click();

        //Move mouse to women and clicl t-shirt
        WebElement women = driver.findElement(By.cssSelector("a[title='Women']"));
        WebElement tShirts = driver.findElement(By.cssSelector("a[title='T-shirts']"));
        Actions move = new Actions(driver);
        move.moveToElement(women);
        move.moveToElement(tShirts).click().build().perform();

        //move mouse to the product and click more
        WebElement product = driver.findElement(By.cssSelector(".product-container"));
        WebElement more = driver.findElement(By.cssSelector("a[title='View']"));
        move.moveToElement(product);
        move.moveToElement(more).click().build().perform();

        //Quantity, size,color and add to cart
        driver.findElement(By.cssSelector(".icon-plus")).click();
        WebElement size = driver.findElement(By.id("group_1"));
        Select l = new Select(size);
        l.selectByValue("3");
        driver.findElement(By.name("Blue")).click();
        driver.findElement(By.cssSelector("p[id='add_to_cart']")).click();

        //proceed until payment and verify if the product was selected
        driver.findElement(By.cssSelector(".btn.btn-default.button.button-medium")).click();
        driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id='center_column']/form/p/button/span")).click();
        driver.findElement(By.id("cgv")).click();
        driver.findElement(By.xpath("//*[@id='form']/p/button/span")).click();
        driver.findElement(By.cssSelector("a[title='Pay by check.']")).click();
        driver.findElement(By.xpath("//*[@id='cart_navigation']/button/span")).click();
        String confirm = driver.findElement(By.cssSelector(".alert.alert-success")).getText();
        if (confirm.contains("complete"))
            System.out.println("Pass");
        else
            System.out.println("Fail");

    }
}
