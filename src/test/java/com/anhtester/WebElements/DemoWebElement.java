package com.anhtester.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElement {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='email']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        Thread.sleep(2000);

        boolean checkButtonLogin = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
        System.out.println("checkButtonLogin: " + checkButtonLogin);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

        boolean checkEmailErrorMessage = driver.findElement(By.xpath("//div[normalize-space()='The Email Address field is required.']")).isDisplayed();
        boolean checkPasswordErrorMessage = driver.findElement(By.xpath("//div[normalize-space()='The Password field is required.']")).isDisplayed();
        System.out.println("checkEmailErrorMessage: " + checkEmailErrorMessage);
        System.out.println("checkPasswordErrorMessage: " + checkPasswordErrorMessage);

        driver.quit();
    }
}
