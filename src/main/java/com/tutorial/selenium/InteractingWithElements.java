package com.tutorial.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class InteractingWithElements {
    public static void main(String[] args) throws InterruptedException{

        By searchResults = By.cssSelector("div[data-index='0']");
        By department = By.xpath("//*[@class='a-size-base a-color-base' and contains(text(), 'Fire Tablets')]");

    System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

    WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        WebElement searchInput;
        searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        searchInput.sendKeys("Amazon Fire");
        searchInput.submit();

        WebElement products = driver.findElement(searchResults);
        System.out.println(products.getText());
        System.out.println(products.getAttribute("class"));

        List<WebElement> departmentsFilter = driver.findElements(department);
        System.out.println("Filter displayed: " + departmentsFilter.get(0).isDisplayed());

        Thread.sleep(2000);

    driver.quit();
}
}
