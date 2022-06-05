package Zadanie2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class payment {
    WebDriver driver;
    public payment(WebDriver driver) {
        this.driver = driver;
    }
    public void clickPayment() throws IOException {
        driver.findElement(By.id("payment-option-1")).click();
        driver.findElement(By.name("conditions_to_approve[terms-and-conditions]")).click();
        driver.findElement(By.xpath("//*[@id=\"payment-confirmation\"]/div[1]/button")).click();
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File(".//screenshot/screenshot.png"));
    }
}
