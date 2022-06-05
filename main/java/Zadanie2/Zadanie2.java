package Zadanie2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Zadanie2 {

    WebDriver driver;

    @Given("user has an account at {string} website")
    public void AnAccountAtWebsite(String url) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }


    @When("user clicks on Sign in button")
    public void signIn() {
        signIn signIn = new signIn(driver);
        signIn.clickSignIn();
    }

    @And("user fills in an email, password field and click Sign in button")
    public void emailPassword() {
        emailPassword emailPassword = new emailPassword(driver);
        emailPassword.login();
    }

    @And("chooses clothes tab")
    public void clothesTab() {
        clothesTab clothesTab = new clothesTab(driver);
        clothesTab.clickClothesTab();
    }

    @Then("chooses HUMMINGBIRD PRINTED SWEATER")
    public void sweater() {
        sweater sweater = new sweater(driver);
        sweater.clickSweater();
    }

    @And("checks if twenty % discount is added")
    public void twentyDiscount() {
    }

    @And("marks size M, quantity  five adds them to the cart")
    public void sizeQuantity() throws InterruptedException {

        sizeQuantity sizeQuantity = new sizeQuantity(driver);
        sizeQuantity.clickSizeQuantity();
    }

    @And("user click proceed button")
    public void userClickProceedButton() {
        proceedButton1 proceedButton1 = new proceedButton1(driver);
        proceedButton1.Button();
    }

    @And("clicks proceed button at shopping cart level")
    public void proceedButton2() {
        proceedButton2 proceedButton2 = new proceedButton2(driver);
        proceedButton2.clickProceed2();


    }

    @And("marks correct address and clicks continue button, shipping method Pick up in-store")
    public void deliveryData() {
        deliveryData deliveryData = new deliveryData(driver);
        deliveryData.enterDeliveryData();

    }

    @And("chooses payment: pay by check, terms of service click order button and take a screenshot of order")
    public void payment() throws IOException {
        payment payment = new payment(driver);
        payment.clickPayment();

    }
    @And("checks history of order")
    public void historyOfOrder() {
        historyOfOrder historyOfOrder = new historyOfOrder(driver);
        historyOfOrder.checkHistoryOfOrder();

    }
    @And("checks if order has Awaiting check payment status and checks correctness of payment")
    public void correctnessOfPayment() {
    }


    @And("close browser")
    public void closeBrowser() {
        //      driver.quit();
    }

}






