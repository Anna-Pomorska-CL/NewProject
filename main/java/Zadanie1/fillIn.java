package Zadanie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fillIn {

    WebDriver driver;
    public fillIn(WebDriver driver) {
      this.driver = driver;

    }
    public void fillInData() {
        driver.findElement(By.name("email")).sendKeys("aniap@wp.pl");
        driver.findElement(By.name("password")).sendKeys("Aniapomorska");
        driver.findElement(By.id("submit-login")).click();
    }
}
