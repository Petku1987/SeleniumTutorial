package com.tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalInteraction {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.w3school.com/bootstrap/bootstrap_modal.asp");

        String currentWindow = driver.getWindowHandle();

        driver.findElement(By.className("btn btn-succes btn-lg")).click();

        Thread.sleep(3000);

        WebElement modal = driver.findElement(By.className("modal-body"));

        for (String windowName : driver.getWindowHandles()) {
            if (!windowName.equals(currentWindow)) {
                driver.switchTo().window(windowName);
                break;
            }
        }

//        modal.findElement(By.className("btn btn-default")).click();
        modal.findElement(By.cssSelector("button[data-dismiss'modal']")).click();
        Thread.sleep(3000);

        driver.switchTo().window(currentWindow);

        driver.quit();

    }
}
