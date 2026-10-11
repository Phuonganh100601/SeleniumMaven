//package com.anhtester;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.time.Duration;
//
//public class DemoSelenium {
//
//    public static <WebDriver> void main(String[] args) throws InterruptedException {
//
//        //Khởi tạo browser với Chrome
//        WebDriver driver;
//        driver = new WebDriver();
//        driver.wait().maximize();
//        driver.wait().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        //Mở trang anhtester.com
//        driver.get("https://anhtester.com/");
//
//        //Click nút Login
//        driver.findElement(By.xpath("//a[@id='btn-login']")).click();
//
//        //Tắt browser
//        driver.quit();
//    }
//
//}
//
