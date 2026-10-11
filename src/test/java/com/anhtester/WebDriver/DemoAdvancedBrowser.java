package com.anhtester.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoAdvancedBrowser {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://anhtester.com/");

        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://www.google.com/");

        Thread.sleep(2000);

        driver.close();

        driver.quit();
    }
}
