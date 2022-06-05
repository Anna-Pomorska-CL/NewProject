package Zadanie2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class historyOfOrder {
    WebDriver driver;
    public historyOfOrder(WebDriver driver) {
        this.driver = driver;
    }
    public void checkHistoryOfOrder() {
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a[2]/span")).click();
        driver.findElement(By.id("history-link")).click();

    }
}
