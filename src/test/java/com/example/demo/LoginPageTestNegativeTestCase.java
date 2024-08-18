package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTestNegativeTestCase {

    @Test
    public static void LoginPage() {
        // WebDriverManager.chromdriver.setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.findElement(By.xpath("(//*[@class='authorization-link']//a[contains(.,'Sign In')])[1]")).click();
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("uyrdtdgd");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("656468");
        driver.findElement(By.xpath("//*[@class='action login primary']")).click();
       // boolean isElementPresent = driver.findElement(By.xpath("//*[@class='mage-error']")).isDisplayed();
        Assert.assertTrue(false, "Enter invalid credentials validation message present");
        driver.quit();
    }
}
