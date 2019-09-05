package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.*;

public class MyStepdefs {
    private WebDriver driver;

    @Given("I am on automation practice site")
    public void i_am_on_automation_practice_site() {
        System.setProperty("webdriver.chrome.driver", "./chrome/chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
//        options.addArguments("window-size=1920x1080");
//        driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @Given("I navigate to contact us form")
    public void i_navigate_to_contact_us_form() {
        homePage homePage = new homePage(driver);
        homePage.clickContactUsPageLink();
    }

    @When("I enter details and hit submit")
    public void i_enter_details_and_hit_submit() {
        contactUsPage contactUsPage = new contactUsPage(driver);
        contactUsPage.fillContactUsForm();
    }

    @Then("I confirmation that the message has been delivered to customer service team")
    public void i_confirmation_that_the_message_has_been_delivered_to_customer_service_team() {
        contactUsPage contactUsPage = new contactUsPage(driver);
        contactUsPage.verifyConfirmationMessage();
    }

    @And("I click sign in on homepage")
    public void iClickSignInOnHomepage() {
        homePage homePage = new homePage(driver);
        homePage.clickSignInLink();
    }

    @When("I try and register with an already registered {string}")
    public void iTryAndRegisterWithAnAlreadyRegistered(String emailAddress) {
        authenticationPage authenticationPage = new authenticationPage(driver);
        authenticationPage.enterEmailAddress(emailAddress);
        authenticationPage.setCreateAccountButton();

    }

    @Then("I should an error message")
    public void iShouldAnErrorMessage() {
        authenticationPage authenticationPage = new authenticationPage(driver);
        authenticationPage.verifyAccountCreationError();
    }

    @And("I search for {string}")
    public void iSearchFor(String product) {
        homePage homePage = new homePage(driver);
        homePage.searchProduct(product);
        homePage.clickProductSearch();
    }

    @And("I add it to cart")
    public void iAddItToCart() {
        productSearchResultsPage productSearchResultsPage = new productSearchResultsPage(driver);
        productSearchResultsPage.clickAddToCartButton();
        productSearchResultsPage.clickProceedToCartButton();
    }

    @When("I click remove from cart")
    public void iClickRemoveFromCart() {
        shoppingCartSummaryPage shoppingCartSummaryPage = new shoppingCartSummaryPage(driver);
        shoppingCartSummaryPage.removeProductFromCart();
    }

    @Then("the product should be removed")
    public void theProductShouldBeRemoved() {
        shoppingCartSummaryPage shoppingCartSummaryPage = new shoppingCartSummaryPage(driver);
        shoppingCartSummaryPage.verifyProductSuccessfullyRemoved();
    }
}
