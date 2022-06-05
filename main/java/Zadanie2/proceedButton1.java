package Zadanie2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class proceedButton1 {
    WebDriver driver;
    public proceedButton1(WebDriver driver) {
        this.driver = driver;
    }
    public void Button(){

        driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")).click();
    }
}
