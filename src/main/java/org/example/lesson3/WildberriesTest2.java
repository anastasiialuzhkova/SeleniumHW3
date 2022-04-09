package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class WildberriesTest2 {
    public static void main(String[]args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://wildberries.ru");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.xpath("//div[@class='navbar-pc__item j-item-addresses']/a[@class='navbar-pc__link']")).click();

        driver.findElement(By.xpath("//div[contains(@id,'YMapsID')]/descendant::input")).sendKeys("Москва");


        driver.findElement(By.xpath("//div[contains(@id,'YMapsID')]/descendant::ymaps[@class='ymaps-2-1-79-searchbox-button-text']")).click();
        driver.findElement(By.xpath("//div[@class='swiper-slide']"));


        Thread.sleep(5000);
        driver.quit();
    }
}
