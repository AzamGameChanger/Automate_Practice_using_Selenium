package com.codewithazam.AutomateMenuLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AutomateRegisterProcess {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        //personal info
        driver.findElement(By.cssSelector(".login")).click();
        driver.findElement(By.id("email_create")).sendKeys("salimov.ali@inbox.ru");
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(3000L);
        driver.findElement(By.cssSelector("input[id='id_gender1']")).click();
        driver.findElement(By.name("customer_firstname")).sendKeys("Ali");
        driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("Salimov");
        driver.findElement(By.cssSelector("#passwd")).sendKeys("123456789");
        WebElement dates =driver.findElement(By.id("days"));
        Select date = new Select(dates);
        date.selectByValue("3");
        WebElement months = driver.findElement(By.xpath("//select[@name='months']"));
        Select month = new Select(months);
        month.selectByValue("4");
        WebElement years = driver.findElement(By.cssSelector("#years"));
        Select year = new Select(years);
        year.selectByIndex(20);
        //Address
        driver.findElement(By.id("firstname")).sendKeys("Ali");
        driver.findElement(By.name("lastname")).sendKeys("Salimov");
        driver.findElement(By.id("company")).sendKeys("Apple Inc.");
        driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("1234 Kulak Ave");
        driver.findElement(By.cssSelector("[id='address2']")).sendKeys("Suite 205");
        driver.findElement(By.name("city")).sendKeys("Seattle");
        WebElement states = driver.findElement(By.id("id_state"));
        Select state = new Select(states);
        state.selectByVisibleText("Washington");
        driver.findElement(By.id("postcode")).sendKeys("11100");
        WebElement countries = driver.findElement(By.id("id_country"));
        Select country = new Select(countries);
        country.selectByValue("21");
        driver.findElement(By.cssSelector("#other")).sendKeys("Good one!");
        driver.findElement(By.id("phone_mobile")).sendKeys("444-333-1122");
        driver.findElement(By.name("alias")).sendKeys("132 Dickson Ln");
        driver.findElement(By.id("submitAccount")).click();
        //validate if the page got registered
        String verify = driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).getText();
        if (verify.contains("Salimov")){
            System.out.println("Pass");
        }else {
            System.out.println("Fail, try again!");
        }
    }
}
