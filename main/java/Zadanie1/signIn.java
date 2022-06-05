package Zadanie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signIn {
    WebDriver driver;
    public signIn(WebDriver driver) {
        this.driver = driver;

    }
    public void clickSignIn(){
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a")).click();

    }
}
