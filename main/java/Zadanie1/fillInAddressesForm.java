package Zadanie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fillInAddressesForm {
    WebDriver driver;
    public fillInAddressesForm (WebDriver driver) {
        this.driver = driver;
    }
    public void enterData(String alias, String address, String city, String postal_code, String country, String phone) {
        driver.findElement(By.name("alias")).sendKeys(alias);
        driver.findElement(By.name("address1")).sendKeys(address);
        driver.findElement(By.name("city")).sendKeys(city);
        driver.findElement(By.name("postcode")).sendKeys(postal_code);
        driver.findElement(By.name("id_country")).sendKeys(country);
        driver.findElement(By.name("phone")).sendKeys(phone);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button")).click();

    }


}
