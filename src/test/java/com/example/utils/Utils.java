package com.example.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

  public static WebDriver driver;

  public static void acessarSistema() {
    String driverPath = "C:\\Users\\msalmeida4\\chromedriver\\chromedriver.exe";
    
    System.setProperty("webdriver.chrome.driver", driverPath);
    
    driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    driver.get("https://opensource-demo.orangehrmlive.com/");
  }
}