package Zadanie2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class sweater {
    WebDriver driver;

    public sweater(WebDriver driver) {
        this.driver = driver;
    }
    public void clickSweater() {
        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[2]/div/a/img")).click();
    }
}
