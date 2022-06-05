package Zadanie2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class clothesTab {
    WebDriver driver;
    public clothesTab(WebDriver driver) {
        this.driver = driver;
    }
    public void clickClothesTab () {
        driver.findElement(By.id("category-3")).click();
    }
}
