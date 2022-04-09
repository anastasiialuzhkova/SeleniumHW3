package org.example.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class WildberriesTest {
    public static void main(String[]args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://wildberries.ru");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        Thread.sleep(10000);

        driver.findElement(By.xpath("//button[@class='nav-element__burger j-menu-burger-btn']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(@href,'https://www.wildberries.ru/catalog/zhenshchinam')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='j-menu-item']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//img[@class='j-thumbnail thumbnail']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@class='sizes-list__item']/label[contains(@class,'j-size')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='btn-main']")).click();

        Thread.sleep(10000);

        driver.findElement(By.xpath("//div[@class='navbar-pc__item j-item-basket']/a[@class='navbar-pc__link']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='list-item__wrap']"));

        Thread.sleep(5000);
        driver.quit();
    }
}
