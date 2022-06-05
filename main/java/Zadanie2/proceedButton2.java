package Zadanie2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class proceedButton2 {
    WebDriver driver;
    public proceedButton2(WebDriver driver) {
        this.driver = driver;
    }
    public void clickProceed2() {
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")).click();
    }
}
