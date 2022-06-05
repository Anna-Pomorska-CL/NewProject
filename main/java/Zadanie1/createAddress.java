package Zadanie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class createAddress {
    WebDriver driver;
    public createAddress(WebDriver driver) {
        this.driver = driver;
    }
    public void clickCreateAddress() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/a")).click();


    }

}
