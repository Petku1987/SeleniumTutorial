package com.tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/upload");

        WebElement fileUpload = driver.findElement(By.id("file-upload"));
        try {

            fileUpload.sendKeys("C:\\Users\\Sasa\\IdeaProjects\\SeleniumTutorial\\src\\main\\resources\\chromedriver.exe");

            driver.findElement(By.id("file-submit")).click();
        } finally {
            Thread.sleep(3000);
            driver.quit();
        }

    }
}
