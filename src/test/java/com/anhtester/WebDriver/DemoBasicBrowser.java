package com.anhtester.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoBasicBrowser {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://anhtester.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        String url = driver.getCurrentUrl();
        System.out.println("Page URL: " + url);

        String html = driver.getPageSource();
        System.out.println("Page HTML: " + html);

        driver.quit();
    }
}
