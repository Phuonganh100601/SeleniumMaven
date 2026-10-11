package com.anhtester.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElement01 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");

        boolean checkButtonSubmit = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();
        System.out.println("checkButtonSubmit: " + checkButtonSubmit);

        driver.quit();
    }
}
