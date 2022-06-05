package Zadanie2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class emailPassword {
    WebDriver driver;
    public emailPassword(WebDriver driver) {
        this.driver = driver;
    }
    public void login() {
        driver.findElement(By.name("email")).sendKeys("aniap@wp.pl");
        driver.findElement(By.name("password")).sendKeys("Aniapomorska");
        driver.findElement(By.id("submit-login")).click();
    }
}
