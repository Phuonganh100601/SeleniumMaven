package com.anhtester.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElement02 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();

        boolean checkCheckboxRememberMe = driver.findElement(By.xpath("//input[@id='remember']")).isSelected();
        System.out.println("checkCheckboxRememberMe: " + checkCheckboxRememberMe);

        driver.quit();
    }
}
