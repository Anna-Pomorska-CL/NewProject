package Zadanie2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sizeQuantity {
    WebDriver driver;
    public sizeQuantity(WebDriver driver) {
        this.driver = driver;
    }
    public void clickSizeQuantity() throws InterruptedException {
        driver.findElement(By.id("group_1")).sendKeys("M");
        WebElement size = driver.findElement(By.id("quantity_wanted"));
        size.clear();
        size.sendKeys("5");
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")).click();
        Thread.sleep(2000);

    }
}
