package com.codewithazam.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class e2e {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/codewithazam/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.phptravels.net/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("[data-name='flights']")).click();

        //clicking from
        WebElement element= driver.findElement(By.cssSelector("[id='s2id_location_from']"));
        Actions a = new Actions(driver);
        a.moveToElement(element).click().sendKeys("aus").build().perform();

        List<WebElement> list = driver.findElements(By.cssSelector("li[class='select2-results-dept-0 select2-result select2-result-selectable']"));
        for (WebElement e: list){
            if (e.getText().equalsIgnoreCase("Manaus (MAO)")){
                e.click();
                break;
            }
        }

        //clicking to
        WebElement to = driver.findElement(By.id("s2id_location_to"));
        a.moveToElement(to).click().sendKeys("rus").build().perform();

        List<WebElement> lists = driver.findElements(By.cssSelector("li[class='select2-results-dept-0 select2-result select2-result-selectable']"));
        for (WebElement t: lists){
            //System.out.println(t.getText());
            if (t.getText().equalsIgnoreCase("Jerusalem (JRS)")){
                t.click();
                break;
            }
        }

        //calendar
        driver.findElement(By.id("FlightsDateStart")).click();
        driver.findElement(By.xpath("//*[@id='datepickers-container']/div[9]/div/div/div[2]/div[6]")).click();

        for (int i=1;i<3;i++){
            driver.findElement(By.xpath("//*[@id='flights']/div/div/form/div/div/div[3]/div[3]/div/div/div[1]/div/div[2]/div/span/button[1]")).click();
        }

        driver.findElement(By.xpath("//*[@id='flights']/div/div/form/div/div/div[3]/div[4]/button")).click();
    }
}
