package Zadanie2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class deliveryData {
    WebDriver driver;
    public deliveryData(WebDriver driver) {
        this.driver = driver;
    }
    public void enterDeliveryData() {
        driver.findElement(By.xpath("//*[@id=\"id-address-delivery-address-25390\"]/header/label/span[1]/span")).click();
        driver.findElement(By.name("confirm-addresses")).click();
        driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/div/div[1]/div[1]/div/span/span")).click();
        driver.findElement(By.name("confirmDeliveryOption")).click();

    }
}
