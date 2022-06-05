package Zadanie1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie1 {
    WebDriver driver;

        @Given("user has created an account at {string} website")
        public void userHasCreatedAnAccount (String url) throws  InterruptedException {

            System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(url);
        }

    @When("user click Sign in button")
    public void userClickSignInButton() {
            signIn signIn = new signIn(driver);
            signIn.clickSignIn();
    }

    @And("user fill in an email, password field and click Sign in button")
    public void userFillInAnEmailPasswordFieldAndClickSignInButton() {
            fillIn fillIn = new fillIn(driver);
            fillIn.fillInData();
    }

    @Then("user click on Addresses")
    public void userClickOnAddresses() {
            clickAddresses clickAddresses = new clickAddresses((driver));
            clickAddresses.Addresses();
    }

    @And("user click on Create new address")
    public void userClickOnCreateNewAddress() {
            createAddress createAddress = new createAddress((driver));
            createAddress.clickCreateAddress();
    }

    @And("user fill in {string}, {string}, {string}, {string}, {string}, {string} and click save button")
    public void userFillInAndClickSaveButton(String alias, String address, String city, String postal_code, String country, String phone) {
        fillInAddressesForm fillInAddressesForm = new fillInAddressesForm(driver);
        fillInAddressesForm.enterData(alias, address, city, postal_code, country, phone);

    }

    @And("user check if all data is correct")
    public void userCheckIfAllDataIsCorrect() {
    }

    @And("Browser is closed")
    public void browserIsClosed() {
            driver.quit();
    }
    }










