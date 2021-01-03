package com.example.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class ArticleHelper extends  HelperBase{
    public ArticleHelper(AppiumDriver driver) {
        super(driver);
    }

    public void search() {
        waitForElementAndClick(By.id("search_container"), 5);
        type(By.xpath("//*[@text='Search…']") , "TCP/IP");
        waitForElementAndClick(By.id("page_list_item_container"), 15);
        String title = driver.findElement(By.id("view_page_title_text")).getText();
        System.out.println(title);


    }

    public void addToFavorits() {
        waitForElementAndClick(
                By.xpath("//*[@content-desc ='Add this article to a reading list']"), 5);
    }

    public void createReadingList() {
        waitForElementAndClick(By.xpath("//*[@text = 'GOT IT']"),10);
        waitForElementAndType(By.xpath("//*[@resource-id = 'org.wikipedia:id/text_input']"), 15, "MyFavorites");
        driver.findElement(By.xpath("//*[@text = 'OK']")).click();


    }

    public void articleClose() {
        driver.findElement(By.xpath("//*[@content-desc ='Navigate up']")).click();
    }

    public void removeFromFavorits() {
        swipeToLeft(By.id("page_list_item_container"));
    }
}