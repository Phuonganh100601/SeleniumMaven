package com.anhtester.WebDriver;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoCookiesBrowser {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        Cookie newCookie = new Cookie("sp_session", "48eef37a9d7b85bfb8ca6c70aab2aff2be32af17");
        driver.manage().addCookie(newCookie);

        driver.get("https://crm.anhtester.com/admin/authentication");

        Thread.sleep(2000);
        driver.quit();
    }
}
