package com.tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddRemoveElements {

        public static void main(String[] args) throws InterruptedException {


            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");

            Thread.sleep(5000);
            driver.findElements(By.tagName("button")).get(0).click();
            Thread.sleep(5000);
            driver.findElements(By.name("Delete")).get(1).click();
            Thread.sleep(5000);

            driver.quit();

    }
}
