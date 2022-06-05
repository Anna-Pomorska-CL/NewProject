package Zadanie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class clickAddresses {
    WebDriver driver;
    public clickAddresses(WebDriver driver) {

        this.driver = driver;
    }
    public void Addresses() {
        driver.findElement(By.xpath("//*[@id=\"addresses-link\"]")).click();
    }
}
